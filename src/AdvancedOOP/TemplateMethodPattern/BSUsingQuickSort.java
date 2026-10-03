package AdvancedOOP.TemplateMethodPattern;

public class BSUsingQuickSort<E extends Comparable<E>> extends BinarySearch<E> {

    @Override
    public void sort(E[] elements) {
        // sort()는 배열만 받으므로, 범위를 다루는 재귀는 도우미 메서드로 분리
        quickSort(elements, 0, elements.length - 1);
    }

    private void quickSort(E[] elements, int low, int high) {
        if (low >= high) return;   // 원소가 1개 이하면 이미 정렬됨

        int pivotIndex = partition(elements, low, high);
        quickSort(elements, low, pivotIndex - 1);    // 피벗 왼쪽 정렬
        quickSort(elements, pivotIndex + 1, high);   // 피벗 오른쪽 정렬
    }

    // 맨 끝 값을 피벗으로 잡고, 피벗보다 작거나 같은 값은 왼쪽으로 모음
    private int partition(E[] elements, int low, int high) {
        E pivot = elements[high];
        int i = low - 1;   // "피벗 이하 구역"의 마지막 위치

        for (int j = low; j < high; j++) {
            if (elements[j].compareTo(pivot) <= 0) {
                i++;
                swap(elements, i, j);
            }
        }
        swap(elements, i + 1, high);   // 피벗을 두 구역 사이에 배치
        return i + 1;                  // 피벗의 최종 위치
    }

    private void swap(E[] elements, int a, int b) {
        E temp = elements[a];
        elements[a] = elements[b];
        elements[b] = temp;
    }
}
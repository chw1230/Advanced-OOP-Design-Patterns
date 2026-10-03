package AdvancedOOP.TemplateMethodPattern;

public class BSUsingBubbleSort<E extends Comparable<E>> extends BinarySearch<E> {
    @Override
    public void sort(E[] elements) {
        int n = elements.length;

        // 한 바퀴 돌 때마다 가장 큰 값이 맨 뒤로 이동 → 뒤쪽 i개는 이미 정렬 완료
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                // 앞이 뒤보다 크면 자리 교환 (제네릭이라 > 대신 compareTo 사용)
                if (elements[j].compareTo(elements[j + 1]) > 0) {
                    E temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                    swapped = true;
                }
            }

            // 한 바퀴 동안 교환이 없었다면 이미 정렬된 상태 → 조기 종료
            if (!swapped) break;
        }
    }
}

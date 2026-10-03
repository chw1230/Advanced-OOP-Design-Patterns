package AdvancedOOP.TemplateMethodPattern;

abstract class BinarySearch<E extends Comparable<E>> {

    // 템플릿으로 정의한 순서
    public final boolean search(E[] elements, E element) {
        // 정렬을 하고 - 여기가 종류별로 다른 부분!
        sort(elements);

        // 정렬이 된 상태에서 탐색을 진행 - 여기가 공통된 부분!
        int low = 0;
        int high = elements.length - 1;
        int middle = 0;
        while (low <= high) {
            middle = low + ((high - low) / 2);
            if (element.compareTo(elements[middle]) == 0) {
                return true;
            }
            else if (element.compareTo(elements[middle]) > 0) {
                low = middle + 1; // 왼쪽 절반 배제
            }
            else {
                high = middle - 1; // 오른쪽 절반 배제
            }
        }

        return false;
    }

    // 분기되어 다르게 정의되는 부분 - 틀만 선언
    public abstract void sort(E[] elements);
}

package AdvancedOOP.TemplateMethodPattern;

public class MainUsingBinarySearch {
    public static void main(String[] args) {
        Integer[] arr = { 1, 5, 3, 10, 4, 8, 6 };

        BinarySearch<Integer> bs1 = new BSUsingBubbleSort<>();
        System.out.println(bs1.search(arr.clone(), 11));
        System.out.println(bs1.search(arr.clone(), 3));

        BinarySearch<Integer> bs2 = new BSUsingQuickSort<>();
        System.out.println(bs2.search(arr.clone(), 11));
        System.out.println(bs2.search(arr.clone(), 3));
    }
}

package AdvancedOOP.Adapter.어뎁터사용예시;

import java.util.Arrays;
import java.util.List;

public class ArraysAdapter {
    public static void main(String[] args) {
        String[] cities = {"Seoul", "Incheon", "Busan", "Sejong"};
        List<String> cityList = Arrays.asList(cities);

        System.out.printf("cities.length = %d\n", cities.length);
        System.out.printf("cityList.size = %d\n", cityList.size());

        // 리스트의 0번째 요소를 변경하기
        cityList.set(0, "Suwon");

        System.out.println("\nPrint out cities");
        for (String s : cities) {
            System.out.println(s);
        }

        System.out.println("\nPrint out cityList");
        for (String s : cityList) {
            System.out.println(s);
        }
    }
}

package AdvancedOOP.FactoryMethodPattern.팩토리실습무기;

import java.util.Scanner;

// Client - 무기 타입만 입력하면 Factory, Weapon 인터페이스만으로 공격 실행 (구체 클래스 모름 -> DIP 지킴)
public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("무기 타입 입력 (sword / bow / gun, 종료: quit) : ");
        String type = sc.next();
        while (!type.equals("quit")) {
            Factory factory = WeaponFactoryRegistry.getFactory(type); // 이름을 전달해서 공장을 얻기
            if (factory == null) {
                System.out.println("없는 무기 타입입니다!");
            } else {
                Weapon weapon = factory.create();
                System.out.println(weapon.attack());
            }
            System.out.println("---------------------------------------");

            System.out.print("무기 타입 입력 (sword / bow / gun, 종료: quit) : ");
            type = sc.next();
        }
    }
}
package AdvancedOOP.FactoryMethodPattern.도형넓이실습;

import java.util.Scanner;

public class MainUsingShapeFactory2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShapeFactory1 factory;
        String type = sc.next();
        while (!type.equals("quit")) {
            factory = ShapeFactory2.getFactory(type); // 이름을 전달해서 공장을 얻기
            Shape shape = factory.create(12, 10);
            System.out.printf("The area of %s: %f\n", shape.getClass().getName(), shape.calcArea());
        }
    }
}

// 해당 코드는 이름만 전달하면 그에 따른 적절한 factory가 넘어오고, 그것을 이용해서 도형을 생성한다.
/*
 장점 : 생성 코드가 한 곳에 모여서 객체 종류가 능거나 생성 방법이 바뀌어도 연쇄적인 수저잉 적음
 단점 : 제품 하나마다 공장 클래스가 하나씩 필요, 클래스 폭발 가능! / crate로 고정되어서 재료가 다른 경우 해당 문제 해결이 어려울 수 있음!
 */

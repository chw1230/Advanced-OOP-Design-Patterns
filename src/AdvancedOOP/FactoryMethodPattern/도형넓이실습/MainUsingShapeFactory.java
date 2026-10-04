package AdvancedOOP.FactoryMethodPattern.도형넓이실습;

public class MainUsingShapeFactory {
    public static void main(String[] args) {
        // 문제점 발생 1번 - 여전히 main에 구체 클래스가 명시 -> 아직 결합성이 높음!!
        ShapeFactory1[] factories = { new RectangleFactory1(), new EllipseFactory1() };

        for (ShapeFactory1 factory : factories) {
            Shape shape = factory.create(12, 10);
            System.out.printf("The area of %s: %f\n", shape.getClass().getName(), shape.calcArea());
        }
    }
}

package AdvancedOOP.FactoryMethodPattern.도형넓이실습;

// 실제로 new를 하는 동작이 담긴 곳
public class RectangleFactory1 implements ShapeFactory1 {
    @Override
    public Shape create(int width, int height) {
        return new Rectangle(width, height);
    }
}

package AdvancedOOP.FactoryMethodPattern.도형넓이실습;

// Concrete Product - 실제 물건
public class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }
}

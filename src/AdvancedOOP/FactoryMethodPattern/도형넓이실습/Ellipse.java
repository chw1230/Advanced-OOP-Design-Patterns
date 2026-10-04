package AdvancedOOP.FactoryMethodPattern.도형넓이실습;

// Concrete Product - 실제 물건
public class Ellipse implements Shape {
    private int width;
    private int height;

    public Ellipse(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double calcArea() {
        return (width / 2) * (height / 2) * Math.PI;
    }
}

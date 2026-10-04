package AdvancedOOP.FactoryMethodPattern.도형넓이실습;

// 공장의 공통 규격 ( create() 약속 )
public interface ShapeFactory1 {
    public Shape create(int width, int height);
}

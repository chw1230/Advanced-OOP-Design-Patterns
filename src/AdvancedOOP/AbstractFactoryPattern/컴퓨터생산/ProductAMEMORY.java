package AdvancedOOP.AbstractFactoryPattern.컴퓨터생산;

// 실제 제품
public class ProductAMEMORY implements AbstractProductMEMORY {
    @Override
    public void process() {
        System.out.println("A사 메모리 동작");
    }
}

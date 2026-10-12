package AdvancedOOP.AbstractFactoryPattern.컴퓨터생산;

// 실제 제품
public class ProductACPU implements AbstractProductCPU {
    @Override
    public void process() {
        System.out.println("A사 CPU 동작");
    }
}

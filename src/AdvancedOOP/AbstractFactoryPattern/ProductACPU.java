package AdvancedOOP.AbstractFactoryPattern;

// 실제 제품
public class ProductACPU implements AbstractProductCPU {
    @Override
    public void process() {
        System.out.println("A사 CPU 동작");
    }
}

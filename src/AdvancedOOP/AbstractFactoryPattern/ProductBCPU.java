package AdvancedOOP.AbstractFactoryPattern;

// 실제 제품
public class ProductBCPU implements AbstractProductCPU {
    @Override
    public void process() {
        System.out.println("B사 CPU 동작");
    }
}

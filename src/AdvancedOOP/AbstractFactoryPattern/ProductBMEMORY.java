package AdvancedOOP.AbstractFactoryPattern;

// 실제 제품
public class ProductBMEMORY implements AbstractProductMEMORY {
    @Override
    public void process() {
        System.out.println("B사 메모리 동작");
    }
}

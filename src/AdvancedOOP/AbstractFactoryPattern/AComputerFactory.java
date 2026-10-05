package AdvancedOOP.AbstractFactoryPattern;

// A사 세트를 만드는 공장
public class AComputerFactory implements ComputerFactory {
    @Override
    public AbstractProductCPU createCPU() {
        return new ProductACPU();
    }

    @Override
    public AbstractProductMEMORY createMEMORY() {
        return new  ProductAMEMORY();
    }
}

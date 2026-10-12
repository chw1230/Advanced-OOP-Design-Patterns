package AdvancedOOP.AbstractFactoryPattern.컴퓨터생산;

// B사 세트를 만드는 공장
public class BComputerFactory implements ComputerFactory {
    @Override
    public AbstractProductCPU createCPU() {
        return new ProductBCPU();
    }

    @Override
    public AbstractProductMEMORY createMEMORY() {
        return new ProductBMEMORY();
    }
}

package AdvancedOOP.AbstractFactoryPattern;

// 세트 공장의 규격
public interface ComputerFactory {
    AbstractProductCPU createCPU();
    AbstractProductMEMORY createMEMORY();
}
// 생성 메서드 여러 개를 인터페이스 하나에 모은 것!! -> 클래스의 폭발을 막는 주요 코드
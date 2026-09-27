package AdvancedOOP.DecoratorPattern.과제노트북외부주변기기;

public class ExternalHardDrive extends AbstractExternalDevice {
    public ExternalHardDrive(InterfaceNotebookComputer computer) {
        super(computer, 40.0, "External Hard Drive");
    }

    // requiredSpace()는 따로 구현하지 않음!!
    // 모든 주변기기가 "감싼 객체의 공간 + 내 공간"으로 똑같이 계산하므로
    // 부모(AbstractExternalDevice)의 requiredSpace()를 그대로 물려받아 사용한다!
    // 내 공간(space)은 위의 super(...)로 넘긴 값이 사용됨
}

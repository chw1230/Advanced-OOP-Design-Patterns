package AdvancedOOP.DecoratorPattern.과제노트북외부주변기기;

public abstract class AbstractExternalDevice implements InterfaceNotebookComputer {
    protected InterfaceNotebookComputer computer;
    protected double space;
    protected String deviceType;

    public AbstractExternalDevice(InterfaceNotebookComputer computer, double space, String deviceType) {
        this.computer = computer;
        this.space = space;
        this.deviceType = deviceType;
    }

    @Override
    public double requiredSpace() {
        // 기존꺼에 새롭게 추가된 거를 더해서 반환
        return computer.requiredSpace() + space;
    }

    @Override
    public String getDeviceType() {
        // 기존꺼에 새롭게 추가된 거를 더해서 반환
        return computer.getDeviceType() + ", " + deviceType;
    }

    @Override
    public String toString() {
        return "Devices: " + getDeviceType() + "\nRequired space: " + requiredSpace();
    }
}

package AdvancedOOP.DecoratorPattern.과제노트북외부주변기기;

public class NotebookComputer implements InterfaceNotebookComputer {
    final String owner;
    final double space = 250.0;

    public NotebookComputer(String owner) {
        this.owner = owner;
    }

    @Override
    public double requiredSpace() {
        return space;
    }

    @Override
    public String getDeviceType() {
        return owner + "의 Notebook computer";
    }

    @Override
    public String toString() {
        return "Devices: " + getDeviceType() + "\nRequired space: " + requiredSpace();
    }
}

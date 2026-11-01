package AdvancedOOP.CommandPattern.redoUndo;

public class LightOnCmd implements Command {
    private Light light;

    public LightOnCmd(Light l) {
        this.light = l;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}

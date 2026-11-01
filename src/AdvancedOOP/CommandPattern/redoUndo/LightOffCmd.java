package AdvancedOOP.CommandPattern.redoUndo;

public class LightOffCmd implements Command {
    private Light light;

    public LightOffCmd(Light l) {
        this.light = l;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}

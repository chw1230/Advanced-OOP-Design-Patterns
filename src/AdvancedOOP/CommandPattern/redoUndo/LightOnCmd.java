package AdvancedOOP.CommandPattern.redoUndo;

// Concrete Command : Command를 구현한 클래스
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
    } // 본 목적의 반대로
}

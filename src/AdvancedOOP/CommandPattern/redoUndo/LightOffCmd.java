package AdvancedOOP.CommandPattern.redoUndo;

// Concrete Command : Command를 구현한 클래스
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
    } // 본 목적의 반대로
}

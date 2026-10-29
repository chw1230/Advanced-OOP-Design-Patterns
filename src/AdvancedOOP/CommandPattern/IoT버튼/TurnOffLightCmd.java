package AdvancedOOP.CommandPattern.IoT버튼;

public class TurnOffLightCmd implements Command {
    private Light light;

    public TurnOffLightCmd(Light light) {
        this.light = light;
    }

    public void execute() {
        if ( light != null ) {
            light.off();
        }
    }
}

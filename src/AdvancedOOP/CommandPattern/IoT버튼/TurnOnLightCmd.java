package AdvancedOOP.CommandPattern.IoT버튼;

public class TurnOnLightCmd implements Command {
    private Light light;

    public TurnOnLightCmd(Light light) {
        this.light = light;
    }

    public void execute() {
        if ( light != null ) {
            light.on();
        }
    }
}

package AdvancedOOP.CommandPattern.IoT버튼;

public class MainUsingIoTButton {
    public static void main(String[] args) {
        Light light = new Light();
        Tv tv = new Tv();
        TurnOnLightCmd turnOnLightCmd = new TurnOnLightCmd(light);
        TurnOffLightCmd turnOffLightCmd = new TurnOffLightCmd(light);
        TurnOnTvCmd turnOnTVCmd = new TurnOnTvCmd(tv);
        TurnOffTvCmd turnOffTVCmd = new TurnOffTvCmd(tv);
        IoTButtonInvoker button = new IoTButtonInvoker();

        System.out.println("set commands");
        button.setClickCmd(turnOnLightCmd);
        button.setDoubleCmd(turnOffLightCmd);
        button.setLongPressCmd(turnOnTVCmd);

        System.out.println("button click");
        button.click();
        System.out.println("button double click");
        button.doubleClick();
        System.out.println("button long press");
        button.longPress();
    }
}

package AdvancedOOP.CommandPattern.IoT버튼;

public class MainUsingIoTButton2 {
    public static void main(String[] args) {
        Light light = new Light();
        Tv tv = new Tv();
        TurnOnLightCmd turnOnLightCmd = new TurnOnLightCmd(light);
        TurnOffLightCmd turnOffLightCmd = new TurnOffLightCmd(light);
        TurnOnTvCmd turnOnTVCmd = new TurnOnTvCmd(tv);
        TurnOffTvCmd turnOffTVCmd = new TurnOffTvCmd(tv);
        IoTButtonInvoker button = new IoTButtonInvoker();

        System.out.println("실행 중 기능 교체");
        button.setClickCmd(turnOnLightCmd);
        System.out.println("button click");
        button.click();

        button.setClickCmd(turnOffLightCmd);
        System.out.println("button click");
        button.click();

        button.setClickCmd(turnOnTVCmd);
        System.out.println("button click");
        button.click();
    }
}

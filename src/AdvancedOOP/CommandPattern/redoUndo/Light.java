package AdvancedOOP.CommandPattern.redoUndo;

// Receiver : 명령을 수신하는 클래스 - 실질적인 작업을 수행하는 클래스
public class Light {
    public void on() {
        System.out.println("전등 On");
    }
    public void off() {
        System.out.println("전등 Off");
    }
}

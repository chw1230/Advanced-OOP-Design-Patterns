package AdvancedOOP.DecoratorPattern.과제스마트홈알림;

public class BasicNotification extends Notification {
    @Override
    public void show() {
        System.out.println("알림: 시스템 상태 정상");
    }
}

package AdvancedOOP.DecoratorPattern.과제스마트홈알림;

public class PowerUsageNotification extends NotificationDecorator {
    final String s = "전력 사용량: 1.2kWh";

    public PowerUsageNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void show() {

        notification.show();
        System.out.println("---------------------------------------");
        System.out.println(s);
    }
}

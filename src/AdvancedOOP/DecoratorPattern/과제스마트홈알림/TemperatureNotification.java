package AdvancedOOP.DecoratorPattern.과제스마트홈알림;

public class TemperatureNotification extends NotificationDecorator {
    final String s = "온도: 23도";

    public TemperatureNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void show() {

        notification.show();
        System.out.println("---------------------------------------");
        System.out.println(s);

    }
}

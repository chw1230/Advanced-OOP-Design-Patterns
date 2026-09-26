package AdvancedOOP.DecoratorPattern.과제스마트홈알림;

public class HumidityNotification extends NotificationDecorator {
    final String s = "습도: 45%";

    public HumidityNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void show() {

        notification.show();
        System.out.println("---------------------------------------");
        System.out.println(s);

    }
}

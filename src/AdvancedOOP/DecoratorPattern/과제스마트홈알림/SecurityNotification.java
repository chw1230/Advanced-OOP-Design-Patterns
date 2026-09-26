package AdvancedOOP.DecoratorPattern.과제스마트홈알림;

public class SecurityNotification extends NotificationDecorator {
    final String s = "보안: 현관문 열림 감지";

    public SecurityNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void show() {

        notification.show();
        System.out.println("---------------------------------------");
        System.out.println(s);

    }
}

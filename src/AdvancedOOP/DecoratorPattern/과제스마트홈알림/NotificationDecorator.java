package AdvancedOOP.DecoratorPattern.과제스마트홈알림;

public abstract class NotificationDecorator extends Notification {
    protected Notification notification;

    public NotificationDecorator(Notification notification) {
        this.notification = notification;
    }
}

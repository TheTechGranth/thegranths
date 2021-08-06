package DesignPatterns.Bridge;

public class TextMessage extends Notification {

    public TextMessage(NotificationSender notificationSender) {
        super(notificationSender);
        System.out.println("This is a text message");
    }

    @Override
    void sendMessage() {
        notificationSender.sendNotification();
    }
}

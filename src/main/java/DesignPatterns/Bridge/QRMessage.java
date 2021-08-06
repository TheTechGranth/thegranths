package DesignPatterns.Bridge;

public class QRMessage extends Notification{
    public QRMessage(NotificationSender notificationSender) {
        super(notificationSender);
        System.out.println("This is the QR Code");
    }

    @Override
    void sendMessage() {
        //call some method to build QRCode
        notificationSender.sendNotification();
    }
}

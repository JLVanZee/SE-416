public class NotificationFactory {
    public static Notification createNotification(NotificationChannelType channelType) {
        Notification notification;
        switch(channelType) {
            case EMAIL:
                notification = new EmailNotification();
                break;
            case SMS:
                notification = new SMSNotification();
                break;
            case PUSH:
                notification = new PushNotification();
                break;
            default:
                notification = null;
        }

        return notification;
    }
}

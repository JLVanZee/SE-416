public class Main {
    public static void main(String[] args) {
        System.out.println("Sending Email:");

        Notification n = NotificationFactory.createNotification(NotificationChannelType.EMAIL);
        n.send("How are you doing this weekend? - Jaret");
    }
}
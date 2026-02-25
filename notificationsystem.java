interface Notification {
    void send(String message);
}
class EmailNotification implements Notification {
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}
class SMSNotification implements Notification {
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}
class notificationsystem {
    public static void main(String[] args) {
        Notification n;

        n = new EmailNotification();
        n.send("Welcome!");

        n = new SMSNotification();
        n.send("OTP Verified");
    }
}

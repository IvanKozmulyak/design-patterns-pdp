public class TestServiceLocator {
    public static void main(String[] args) {
        ServiceLocator.registerService("EmailService", new EmailService());
        ServiceLocator.registerService("SmsService", new SmsService());
        ServiceLocator.registerService("NotificationService", new NotificationService());

        NotificationService notificationService = ServiceLocator.getService("NotificationService", NotificationService.class);
        notificationService.sendEmailNotification();
        notificationService.sendSMSNotification();

        try {
            ServiceLocator.getService("invalidService");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
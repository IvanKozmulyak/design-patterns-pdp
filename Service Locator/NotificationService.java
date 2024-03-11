public class NotificationService implements Service {

    private final SmsService smsService;
    private final EmailService emailService;

    public NotificationService() {
        this.smsService = ServiceLocator.getService("SmsService", SmsService.class);
        this.emailService = ServiceLocator.getService("EmailService", EmailService.class);
    }

    public void sendSMSNotification() {
        System.out.println("Notification sent by " + smsService.getName());
    }

    public void sendEmailNotification() {
        System.out.println("Notification sent by " + emailService.getName());
    }

    @Override
    public String getName() {
        return "NotificationService";
    }
}

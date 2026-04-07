package b4;
    //Mục tiêu
    //
    //Sau khi nạp tiền thành công, hệ thống cần gửi thông báo qua:
    //Email
    //SMS

    //Cách 1 :
    // constructor injection
    // @Service
    //public class NotificationService {
    //
    //    private final EmailSender emailSender;
    //    private final SmsSender smsSender;
    //
    //    @Autowired
    //    public NotificationService(EmailSender emailSender, SmsSender smsSender) {
    //        this.emailSender = emailSender;
    //        this.smsSender = smsSender;
    //    }
    //
    //    public void notify(String message) {
    //        emailSender.send(message);
    //
    //        try {
    //            smsSender.send(message);
    //        } catch (Exception e) {
    //            System.out.println("SMS lỗi nhưng không ảnh hưởng hệ thống");
    //        }
    //    }
    //}

    //Cách 2: field injection
    // @Service
    //public class NotificationService {
    //
    //    @Autowired
    //    private EmailSender emailSender;
    //
    //    @Autowired
    //    private SmsSender smsSender;
    //
    //    public void notify(String message) {
    //        emailSender.send(message);
    //
    //        try {
    //            smsSender.send(message);
    //        } catch (Exception e) {
    //            System.out.println("SMS lỗi");
    //        }
    //    }
    //}
    
    // ==> Constructor Injection là lựa chọn tối ưu vì đảm bảo tính an toàn, rõ ràng về dependency và dễ kiểm thử

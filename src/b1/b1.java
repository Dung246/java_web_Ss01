package b1;
interface PaymentGateway {
    void pay(double amount);
}
class InternalPaymentGateway implements PaymentGateway {
    public void pay(double amount) {
        System.out.println("Thanh toán nội bộ: " + amount);
    }
}

class MomoPaymentGateway implements PaymentGateway {
    public void pay(double amount) {
        System.out.println("Thanh toán qua Momo: " + amount);
    }
}

class ZaloPayGateway implements PaymentGateway {
    public void pay(double amount) {
        System.out.println("Thanh toán qua ZaloPay: " + amount);
    }
}

class RechargeService {
    private PaymentGateway gateway;

    public RechargeService(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public void processRecharge(String username, double amount) {
        gateway.pay(amount);
        System.out.println("Nạp " + amount + " cho " + username);
    }
}
public class b1 {
    public static void main(String[] args) {
        PaymentGateway gateway;

        gateway = new MomoPaymentGateway();
        RechargeService service1 = new RechargeService(gateway);
        service1.processRecharge("Dung", 100000);

        System.out.println("------------------");

        gateway = new ZaloPayGateway();
        RechargeService service2 = new RechargeService(gateway);
        service2.processRecharge("Dung", 200000);

        System.out.println("------------------");

        gateway = new InternalPaymentGateway();
        RechargeService service3 = new RechargeService(gateway);
        service3.processRecharge("Dung", 50000);
    }
}

//- Dùng Dependency Injection (Constructor Injection)
//- Phụ thuộc vào interface PaymentGateway
//- Có thể thay đổi cổng thanh toán linh hoạt mà không sửa code cũ
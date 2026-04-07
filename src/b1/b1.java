// Sai ở  public RechargeService() { this.gateway = new InternalPaymentGateway(); }

//Cách viết này vi phạm nguyên lý IoC (Inversion of Control) và gây ra tight coupling vì :
// RechargeService phụ thuộc trực tiếp vào InternalPaymentGateway
// Khi muốn thêm: Momo,ZaloPay → phải sửa code trong class này 
// Dẫn đến khó mửo rộng code,khó test,không tận dụng Spring IoC Container

package abstraction;

public class Creditcard {
    public void pay(String paymentType){
        Pay p = PaymentProvider.getPayment(paymentType);
        p.pay();
    }
}

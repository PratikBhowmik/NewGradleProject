package abstraction;

public class PaymentHandler {
    public static Payment getPayment(String paymentType){
        if(paymentType == null){
        return null;
        }
        switch(paymentType){
            case "DEBIT_CARD":
            return new DebitCard();      
          case "NET_BANKING":
            return new NetBanking();    
          case "UPI":
           return new Googlepay();   
          case "PAYTM_WALLET":
           return new Paytm();
        }
        return null;
    }
}

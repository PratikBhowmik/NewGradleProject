package abstraction;

public class PaymentProvider {
    public static UPIHandler gPayment(String paymentType){
        if(paymentType == null){
            return null;
        }
        switch(paymentType){
            case "DEBIT_CARD":
            return new DebitcardHandler();
            case "NET_BANKING":
            return new NetbankingHandler();
            case "UPI":
            return new UPIHandler();
            case "PAYTM_WALLET":
            return new PaytmHandler();   
        }
        return null;
    }
}


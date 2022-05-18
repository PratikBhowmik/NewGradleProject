package Encapsulation;

public class BankAccount {
    private double balance;
    private int accountNumber;
    public void deposit(double a){
        if(a<=0){
            System.out.println("Amount should be greater than 0");
            return;
        }
        balance = balance+a;
    }
    public void withdraw(double a){
        if(a<=0){
            System.out.println("Amount should be greater than 0 otherwise it won't work!");
            return;
        }
        balance = balance-a;
        if(balance - a < 0){
            System.out.println("Insuffient balance is there in the account");
            return;
        }
        balance=balance-a;
    }
    
}

package programs;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int temp;
        boolean isPrime = true;
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 0 ; i <= num ; i++){
            temp = num%i;
            if(temp == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println(num+ "It's a prime number");
        }else{
            System.out.println(num+ "It's not a prime number");
        }
    }  
}

package Encapsulation;

public class GettersSetters {
    
    private int number;

    public void setNumber(int number){
        if(number<1 || number>10){
            System.out.println("Error is there!");
        }
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }
}

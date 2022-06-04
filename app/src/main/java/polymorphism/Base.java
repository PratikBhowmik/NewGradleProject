package polymorphism;

public class Base {
    public void methodOne(){
        System.out.println("A");
        methodTwo();
    }
    public void methodTwo(){
        System.out.println("B");
    }
}

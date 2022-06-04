package polymorphism;

public class DerivedClass extends Base{

    @Override
    public void methodOne() {
        super.methodOne();
        System.out.println("C");
    }

    @Override
    public void methodTwo() {
        super.methodTwo();
        System.out.println("D");
    }
    
}

package OOP.chapter8_abstractclasses;

public class AbstractClassExample extends AbstractClass{
    @Override //NOT NECCESSARY TO override
    public void aMethod() {
        System.out.println("aMethod() in AbstractClassExample");
    }

    @Override //MUST IMPLEMENT(override) THIS, because this is an abstract method!
    public void anotherMethod() {
        System.out.println("anotherMethod() in AbstractClassExample");
    }

    public static void main(String[] args) {
        //AbstractClass obj = new AbstractClass();    //'AbstractClass' is abstract; cannot be instantiated
        AbstractClassExample o = new AbstractClassExample();
        o.aMethod();
        o.anotherMethod();
    }
}

abstract class AbstractClass {  //abstract class

    public void aMethod() {     //normal instance method
        System.out.println("aMethod() in AbstractClass");
    }

    public abstract void anotherMethod();  //abstract instance method (must implement in subclasses!)
}

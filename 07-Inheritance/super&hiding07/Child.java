package OOP.chapter5.superAndHiding;

public class Child extends Parent{
    protected int i;        //Hiding i of Parent(same name)
    protected byte b;       //Hiding b of Parent(same name)
    protected double d;

    public static void g(){  //This is "hiding" of a method(only static methods)
        System.out.println("g() in Child");
    }

    public void printInfo(){  //This is "Overriding of a method" , not a hiding!
        System.out.println("i: " + i);
        System.out.println("super.i: " + super.i);
        System.out.println("b: " + b);
        System.out.println("super.b: " + super.b);
        g();
        super.g();
        Parent.g();
    }
}

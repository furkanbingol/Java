package OOP.chapter5.superAndHiding;

public class Parent {
    protected int i;
    protected boolean b;

    protected static void g(){
        System.out.println("g() in Parent");
    }

    protected void printInfo(){
        System.out.println("i: " + i);
        System.out.println("b: " + b);
        g();
    }
}

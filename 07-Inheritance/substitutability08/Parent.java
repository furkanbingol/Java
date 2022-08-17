package OOP.chapter5.substitutability;

public class Parent {
    protected int i = 3;
    protected boolean b = false;
    protected static String s = "Parent";

    public static void f(){
        System.out.println("f() in Parent");
    }

    public void g(){
        System.out.println("g() in Parent");
    }
}

package OOP.chapter5.substitutability;

public class Child extends Parent{
    private int i = 5;
    private boolean b = true;
    private static String s = "Child";

    public static void f(){
        System.out.println("f() in Child");
    }

    public void g(){
        System.out.println("g() in Child");
    }
}

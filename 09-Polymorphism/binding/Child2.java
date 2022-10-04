package OOP.chapter7_polymorphism.binding;

public class Child2 extends Parent{
    public static int i = 25;
    public int j = 29;

    //@Override DEĞİL
    private void doThis() {
        System.out.println("The object of Child2 is doing this!");
    }

    //@Override DEĞİL
    public static void doIt() {
        System.out.println("Child2 class is doing it!");
    }

    @Override
    protected void make() {
        System.out.println("The object of Child2 is making something!");
    }
}

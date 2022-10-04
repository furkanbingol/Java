package OOP.chapter7_polymorphism.binding;

public class Child1 extends Parent{
    public static int i = 15;
    public int j = 19;

    //@Override DEĞİL, çünkü metot private
    private void doThis() {
        System.out.println("The object of Child1 is doing this!");
    }

    //@Override DEĞİL, çünkü metot static
    public static void doIt() {
        System.out.println("Child1 class is doing it!");
    }

    @Override
    public void make() {
        System.out.println("The object of Child1 is making something!");
    }

    public static void main(String[] args) {
        Parent p = new Child1();
        p.make();

        Child1.doIt();  //Child1 class is doing it!
        Parent.doIt();  //Parent class is doing it!
        p.doIt();       //Parent class is doing it!
    }
}

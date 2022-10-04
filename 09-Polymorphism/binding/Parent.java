package OOP.chapter7_polymorphism.binding;

public class Parent {
    public static int i = 5;
    public int j = 9;

    private void doThis() {
        System.out.println("The object of Parent is doing this!");
    }

    public final void doThat() {
        System.out.println("The object of Parent is doing that!");
    }

    public static void doIt() {
        System.out.println("Parent class is doing it!");
    }

    protected void make() {
        System.out.println("The object of Parent is making something!");
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p.i);  //Static member accessed via instance reference
        System.out.println(Parent.i);
        System.out.println(p.j);
        p.doThis();
        p.doThat();
        p.doIt();    //Static member accessed via instance reference
        Parent.doIt();
        p.make();
    }
}

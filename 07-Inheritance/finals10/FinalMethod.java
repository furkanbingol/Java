package OOP.chapter5.finals;

public class FinalMethod {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.f();
        p.g();
        Parent.sf();

        Child c = new Child();
        c.f();
        c.g();
        Child.sf();
    }
}

class Parent {
    public final void f(){
        System.out.println("f() in Parent");
    }

    public static final void sf(){
        System.out.println("sf() in Parent");
    }

    public void g(){
        System.out.println("g() in Parent");
    }
}

class Child extends Parent{
    //devralınan sınıftaki "final olan metotları" OVERRIDE veya HIDE edemeyiz!

    @Override
    public void g() {
        String s = "Furkan";
        System.out.println("g() in Child");
    }
}

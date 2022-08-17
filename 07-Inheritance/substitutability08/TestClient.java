package OOP.chapter5.substitutability;

public class TestClient {
    public static void main(String[] args) {
        Parent.f();
        Child.f();                     //we cannot change 'access modifier of f()'(in Child) because of Substitutability!
        System.out.println(Parent.s);  //runs  (protected)
//      System.out.println(Child.s);   //error (private)


        Parent p = new Parent();
        Child c = new Child();

        System.out.println(p.i);
        System.out.println(p.b);
//      System.out.println(c.i);       //error
//      System.out.println(c.b);       //error
    }
}

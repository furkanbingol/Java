package OOP.chapter5.overriding;

public class RestrictiveOverriding {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.f();
        System.out.println(p.i);

        Child c = new Child();
        c.f();
//      System.out.println(c.i);      //error! private access
    }
}

class Parent {
    public int i = 8;

    public void f() {

    }
  
    public void g() {
      i++;
    }
}

class Child extends Parent {
    private int i = 9;  //hiding

    /*
    void f() {  //mirasta, metot overridinglerinde modifier derecesi azaltılamaz! (OO'ya aykırı)

    }
    */
    
    public void g() {   //"overriding" (only in instance methods)
      i += 10;
    }
}

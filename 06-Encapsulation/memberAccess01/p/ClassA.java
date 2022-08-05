package OOP.chapter4.memberAccess.p;

public class ClassA {
    public static void main(String[] args) {
        ClassP p = new ClassP();

        System.out.println(p.x);
        System.out.println(p.y);
        System.out.println(p.w);
        //System.out.println(p.z);  //z is private!(different class)

        p.publicMethod();      //but this method can CALL a PRIVATE METHOD(indirectly)
        p.defaultMethod();     //but this method can CALL a PRIVATE METHOD
        p.protectedMethod();   //but this method can CALL a PRIVATE METHOD
        //p.privateMethod();   privateMethod is private!
    }
}

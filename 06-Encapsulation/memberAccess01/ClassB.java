package OOP.chapter4.memberAccess;

import OOP.chapter4.memberAccess.p.ClassP;

public class ClassB extends ClassP{
    public static void main(String[] args) {
        ClassP p = new ClassP();
        ClassB b = new ClassB();

        System.out.println(p.x);    //runs! because x is public
        //System.out.println(p.y);  //error
        //System.out.println(p.w);  //error
        System.out.println(b.w);    //runs! because classB is CHILD OF classP (can access protected members)
        //System.out.println(p.z);

        p.publicMethod();
        //p.defaultMethod();   //error
        //p.protectedMethod();
        //p.privateMethod();
    }
}

package OOP.chapter5.protectedModifier;

import OOP.chapter5.protectedModifier.differentPackage.Parent2;

public class Child extends Parent1{
    public void printInfo() {
        System.out.println("Child Info");
        System.out.println("x: " + x);
        System.out.println("y: " + y); // Only when they are in the same package.
        System.out.println("t: " + t); // It is accessible because it is inherited.
//      System.out.println("z: " + z); // Never, because z is private!

        f();
        g(); // Only when they are in the same package
        u(); // It is accessible because it is inherited.
//      v(); // Never!
    }

    public void printParentClassInfo1(Parent1 pc) {
        System.out.println("pc.x: " + pc.x);
        System.out.println("pc.y: " + pc.y); // Only when they are in the same package
        System.out.println("pc.t: " + pc.t); // It is accessible because it is in the same package.
//      System.out.println("pc.z: " + pc.z); // Never!

        System.out.println("Parent1.sx: " + Parent1.sx);
        System.out.println("Parent1.sy: " + Parent1.sy); // Only when they are in the same package
        System.out.println("Parent1.st: " + Parent1.st); // It is accessible because it is in the same package.
//      System.out.println("Parent1.sz: " + Parent1.sz); // Never!

        pc.f();
        pc.g();
        pc.u();
//      pc.v();       // Never!

        Parent1.sf();
        Parent1.sg();
        Parent1.su();
//      Parent1.sv(); // Never!
    }

    public void printParentClassInfo2(Parent2 pc) {
        System.out.println("pc.x: " + pc.x);
//      System.out.println("pc.y: " + pc.y); // Only when they are in the same package
//      System.out.println("pc.t: " + pc.t); // It is not accessible because it is not inherited.(in different package)
//      System.out.println("pc.z: " + pc.z); // Never!

        System.out.println("Parent2.sx: " + Parent2.sx);
//      System.out.println("Parent2.sy: " + Parent2.sy); // Only when they are in the same package
//      System.out.println("Parent2.st: " + Parent2.st); // It is accessible
//      System.out.println("Parent2.sz: " + Parent2.sz); // Never!

        pc.f();
//      pc.g(); // Only when they are in the same package
//      pc.u(); // It is not accessible because it is not inherited.
//      pc.v(); // Never!

        Parent2.sf();
//      Parent2.sg(); // Only when they are in the same package
//      Parent2.su(); // It is not accessible because it is not inherited.
//      Parent2.sv(); // Never!
    }
}

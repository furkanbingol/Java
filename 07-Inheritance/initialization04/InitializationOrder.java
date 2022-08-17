package OOP.chapter5.initialization;

public class InitializationOrder{

    public static void main(String[] args) {

//		System.out.println("A.i: " + A.i);
//		System.out.println("B.j: " + B.j);
//		System.out.println("C.k: " + C.k);

//		new A();
//		System.out.println();
//		new B();
//		System.out.println();
//		new C();

    }
}

class A {

    static{   //static initialization block
        System.out.println("Initializing class A");
    }

    {         //instance initialization block
        System.out.println("\nInitializing object A");
    }

    static int i = 8;
    private static X xx = new X();
    private W ww = new W();

    A() {   //constructor (modifier: default(package-private))
        System.out.println("in A()");
    }

    public static final U uu = new U();
}

class B extends A {
    static{
        System.out.println("\nInitializing class B");
    }

    {
        System.out.println("\nInitializing object B");
    }

    static int j = 18;
    private static Y yy = new Y();
    private Z zz = new Z();

    B() {
        System.out.println("in B()");
    }
}

class C extends B {
    static{
        System.out.println("\nInitializing class C");
    }

    {
        System.out.println("\nInitializing object C");
    }
    static int k = 28;
    private static Z zz = new Z();

    C() {
        System.out.println("in C()");
    }
}


class X {
    W ww = new W();

    public X() {
        System.out.println("in X()");
    }
}

class Y {
    public Y() {
        System.out.println("in Y()");
    }
}

class Z {
    W ww = new W();

    public Z() {
        System.out.println("in Z()");
    }
}

class W {
    static {
        System.out.println("in static block of W");
    }

    public W() {
        System.out.println("in W()");
    }
}

class U {
    static {
        System.out.println("in static block of U");
    }

    public U() {
        System.out.println("in U()");
    }
}

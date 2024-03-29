package OOP.chapter5.initialization;

public class ClassInitializationForStatics {
    public static void main(String[] args) {
//		ClassA.f();
//		ClassB.f();
//		ClassC.f();

//		System.out.println("ClassA.i: " + ClassA.i);
//		System.out.println("ClassB.i: " + ClassB.i);
//		System.out.println("ClassC.i: " + ClassC.i);

//		new ClassA().f();
//		new ClassB().f();
//		new ClassC().f();

//		System.out.println("new ClassA().i: " + new ClassA().i);
//		System.out.println("new ClassB().i: " + new ClassB().i);
//		System.out.println("new ClassC().i: " + new ClassC().i);
    }
}

class ClassA {
    public static int i = 5;

    static {
        int k = i;
        System.out.println("in static initializer block of ClassA");
    }

    protected static void f() {
        System.out.println("in f()");
    }
}

class ClassB extends ClassA {

    static {
        System.out.println("in static initializer block of ClassB");
    }
}

class ClassC extends ClassB {

    static {
        System.out.println("in static initializer block of ClassC");
    }
}

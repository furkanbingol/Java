public class ClassInitializationOrder2 {
    public static void main(String[] args) {
        System.out.println("ClassAA.i: " + ClassAA.i);
        System.out.println("ClassAA.j: " + ClassAA.j);
        System.out.println("ClassAA.s: " + ClassAA.s);
        System.out.println(ClassAA.CONSTANT);
        ClassAA.printInfo();      // Causes the initialization of ClassA
        ClassAA a = new ClassAA();
    }
}

class ClassAA {
    static final int i = 11;           //constant
    static final int j = 14;           //constant
    static final String s = "Java";    //constant

    static {
        System.out.println("in static initializer block of ClassAA - 1");
        System.out.println("i: " + i);
        System.out.println("j: " + j);
    }

    public static final String CONSTANT = s;   //constant

    static {
//		CONSTANT = "selam";  // Can't do it.
        System.out.println("CONSTANT: " + CONSTANT);
    }

    //CONSTRUCTOR
    public ClassAA() {
        System.out.println("(constructor)in ClassAA()");
    }

    static {
        System.out.println("in static initializer block of ClassAA - 2");
    }

    static void printInfo() {
        System.out.println("\nInfo");
        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("s: " + s);
    }
}

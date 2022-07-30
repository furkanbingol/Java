public class ObjectConstruction {

    public static void main(String[] args) {
      ClassB b;   //nothing happens
      ClassB b1 = new ClassB();   //first runs instance initialization blocks, then constructor call
      System.out.println("**************************************");
      
      ClassB b2 = new ClassB();   //first runs instance initialization blocks, then constructor call
      System.out.println("**************************************");
      new ClassB().printInfo();
    }
}

class ClassB {
    int i = 5;
    double d;
    String name;

    {
        System.out.println("In {}-1");
        System.out.println("i: " + i);
    }

    {
        System.out.println("In {}-2");
        System.out.println("Initial value of d: " + d);
        d = Math.random() * 10;
        System.out.println("And now the value of d: " + d);
        System.out.println("And now the value of name: " + name);
    }

    {
        System.out.println("In {}-3");
    }

    //CONSTRUCTOR
    public ClassB() {
        this("ClassB");
        System.out.println("\nIn ClassB()");
        System.out.println("The value of d: " + d);
        d = Math.random() * 10;
        System.out.println("And now the value of d: " + d);
    }

    //CONSTRUCTOR
    public ClassB(String name) {
        this.name = name;
        System.out.println("\nIn ClassB(String name)");
        System.out.println("The value of d: " + d);
        d = Math.random() * 10;
        System.out.println("And now the value of d: " + d);
    }

    void printInfo() {
        System.out.println("\nInfo");
        System.out.println("i: " + i + " d: " + d + " name: " + name);
    }
}


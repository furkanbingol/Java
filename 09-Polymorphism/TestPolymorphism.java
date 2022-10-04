package OOP.chapter7_polymorphism;

import OOP.chapter5.factory3.Director;
import OOP.chapter5.factory3.Employee;
import OOP.chapter5.factory3.Manager;

public class TestPolymorphism {
    public static void main(String[] args) {
        System.out.println("--REGULAR assignments--");
        Employee e = new Employee(1, "Ali", 8, "Production");
        e.work();

        Manager m = new Manager(2, "Fatma", 3, "Production", "Production");
        m.work();

        Director d = new Director(3, "Mehmet", 20, "Management", "Management", 3000);
        d.work();

        System.out.println("\n--UPCASTING assignments - 1--");
        e = m;
        e.printInfo();
        e.work();

        e = d;
        e.printInfo();
        e.work();
        System.out.println();

        System.out.println("\n--UPCASTING assignments - 2--");
        Employee e1 = new Employee(1, "Ali", 8, "Production");
        e1.work();
        System.out.println();

        e1 = new Manager(2, "Fatma", 3, "Production", "Production");
        e1.work();
        System.out.println();

        e1 = new Director(3, "Mehmet", 20, "Management", "Management", 3000);
        e1.work();
    }
}

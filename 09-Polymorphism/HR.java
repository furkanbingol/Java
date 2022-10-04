package OOP.chapter7_polymorphism;

import OOP.chapter5.factory3.*;

public class HR {

    public Employee getAnEmployee() {
        Employee e = null;

        int i = (int) (Math.random() * 3);

        switch(i) {
            case 0:
                e = new Employee(1, "Ali", 4, "Production");
                break;
            case 1:
                e = new Manager(2, "Burhan", 14, "Production", "Production");
                break;
            case 2:
                e = new Director(3, "Furkan", 24, "Management", "Management", 4000);
                break;
        }

        return e;
    }
}

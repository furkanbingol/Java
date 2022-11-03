package OOP.chapter9_interfaces.factory2;

public class HR {
    public Employee getAnEmployee() {
        Employee e = null;

        int i = (int) (Math.random() * 3);
        int no = (int) (Math.random() * 100);

        switch(i) {
            case 0:
                e = new Employee(no, "Ali", 4, "Production");
                break;
            case 1:
                e = new Manager(no, "Burhan", 14, "Production", "Production");
                break;
            case 2:
                e = new Director(no, "Furkan", 24, "Management", "Management", 4000);
                break;
        }

        return e;
    }
}

package OOP.chapter9_interfaces.factory1;

public class Test {
    public static void main(String[] args) {
        //Worker w1 = new Worker();   //Worker() is interface(fully abstract), cannot be instantiated!
        Worker w = new Employee(1, "Ali", 4, "Production");
        w.work();
        //w.calculateSalary();   //can't do that!(polymorphism's bad side)

        Employee e = null;
        if (w instanceof Employee){
            e = (Employee) w;
            e.printInfo();
        }

        w = new Manager(5, "İsmail", 14, "Production", "Production");
        w.work();

        Manager m = null;
        if (w instanceof Manager)
            m = (Manager) w;
        m.manage();
    }
}

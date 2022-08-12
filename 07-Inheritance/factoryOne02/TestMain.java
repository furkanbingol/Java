package OOP.chapter5.factory1;

public class TestMain {
    public static void main(String[] args) {
        Employee e = new Employee(1,"Ali",14,"Production");
        e.printInfo();
        System.out.println("Maaşı: " + e.calculateSalary());
        e.work();

        System.out.print("\n");

        Manager m = new Manager(2,"Ayşe",3,"Production","Production");
        m.printInfo();
        System.out.println("Maaşı: " + m.calculateSalary());
        m.work();

        System.out.print("\n");

        Director d = new Director(3,"Furkan",2,"Management","Management",10000);
        d.printInfo();
        System.out.println("Maaşı : " + d.calculateSalary());
        d.work();

        System.out.println(d);  //hash code of object d

        accessStaticMembers(e, m, d);
    }

    public static void accessStaticMembers(Employee e, Manager m, Director d){
        System.out.println("\nAccessing static members: ");
        System.out.println(Employee.BASE_SALARY);       //same
        System.out.println(Employee.getBaseSalary());   //same
        System.out.println(e.BASE_SALARY + "\n");       //same but "accessed via instance reference"

        System.out.println(Manager.BASE_SALARY);
        System.out.println(Manager.getBaseSalary());
        System.out.println(Director.BASE_SALARY);
        System.out.println(Director.getBaseSalary() + "\n");

        System.out.println(Manager.MANAGEMENT_PAYMENT);
        System.out.println(Director.DIRECTOR_PAYMENT);
    }
}

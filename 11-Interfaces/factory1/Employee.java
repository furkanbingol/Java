package OOP.chapter9_interfaces.factory1;

public class Employee implements Worker{
    private static final int BASE_SALARY = 500;
    protected int no;
    protected String name;
    protected int year;
    protected String department;

    public Employee(int no, String name, int year, String department) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.department = department;
    }

    public Employee(int no, String name, int year) {
        this.no = no;
        this.name = name;
        this.year = year;
    }

    @Override
    public void work() {
        System.out.println("Employee is working!");
    }

    public void printInfo() {
        System.out.println("\n No: " + no);
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
        System.out.println("Department: " + department);
    }
}

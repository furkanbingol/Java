package OOP.chapter9_interfaces.factory2;

public class Employee implements Worker, Comparable {  //Employee implements "2 interfaces"
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

    @Override
    public int compareTo(Object o) {
        if(o instanceof Employee e) {
            if (no < e.no)
                return -1;
            else if (no == e.no)
                return 0;
            else
                return 1;
        }
        return 0;
    }

    public void printInfo() {
        System.out.println();
        System.out.println("\n No: " + no);
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
        System.out.println("Department: " + department);
    }
}

package OOP.chapter5.factory1;

public class Employee {   //Parent Class
    protected int no;
    protected String name;
    protected int year;
    protected String department;

    public static final int BASE_SALARY = 500; //sabite

    public static int getBaseSalary(){  //static method
        return BASE_SALARY;
    }

    public Employee(int no, String name, int year, String department) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.department = department;
        System.out.println("in Employee() constructor");
    }

    public void work(){
        System.out.println("Employee is working!");
    }

    public double calculateSalary(){
        return (year * BASE_SALARY);
    }

    public void printInfo(){
        System.out.println("\n-----Printing Infos-----");
        System.out.println("No: " + no);
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
        System.out.println("Department: " + department);
    }
}

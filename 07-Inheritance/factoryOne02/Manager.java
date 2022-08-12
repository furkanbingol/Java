package OOP.chapter5.factory1;

public class Manager extends Employee{
    protected String departmentManaged;

    public static final int MANAGEMENT_PAYMENT = 5000;  //sabite

    public Manager(int no, String name, int year, String department, String departmentManaged) {
        super(no, name, year, department);  //calls "parent's constructor" with 'super()'
        this.departmentManaged = departmentManaged;
        System.out.println("in Manager() constructor");
    }
}

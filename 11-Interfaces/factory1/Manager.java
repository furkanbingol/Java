package OOP.chapter9_interfaces.factory1;

public class Manager extends Employee{
    protected String departmentManaged;

    public static final int MANAGEMENT_PAYMENT = 3000;

    public Manager(int no, String name, int year, String department, String departmentManaged) {
        super(no, name, year, department);
        this.departmentManaged = departmentManaged;
    }

    public Manager(int no, String name, int year, String departmentManaged) {
        super(no, name, year);
        this.departmentManaged = departmentManaged;
    }

    //Bu override, zorunlu değil!
    @Override
    public void work() {
        System.out.println("Manager is working!");
        manage();
    }

    public void manage() {
        System.out.println("Manager manages department: " + departmentManaged);
    }
}

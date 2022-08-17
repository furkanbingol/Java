package OOP.chapter5.factory3;

public class Manager extends Employee{
    protected String departmentManaged;

    public static final int MANAGEMENT_PAYMENT = 6000;

    public Manager(int no, String name, int year, String workingDepartment, String departmentManaged){
        super(no, name, year, workingDepartment);
        this.departmentManaged = departmentManaged;
    }

    @Override
    public void work(){
        System.out.println("Manager is working!");
        manage();
    }

    public void manage(){
        System.out.println("Manager manages department: " + departmentManaged);
    }

    @Override
    public double calculateSalary(){
        return year * BASE_SALARY + MANAGEMENT_PAYMENT;
    }

    @Override
    public void printInfo(){
        System.out.println("\nNo: " + no);
        System.out.println("Name:" + name);
        System.out.println("Year: " + year);
        System.out.println("Department: " + department);
        System.out.println("Managing Department: " + departmentManaged);
    }
}

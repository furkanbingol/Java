package OOP.chapter5.factory2;

public class Director extends Manager{
    protected double bonus;

    public Director(int no, String name, int year, String workingDepartment, String managingDepartment, double bonus) {
        super(no, name, year, workingDepartment, managingDepartment);
        this.bonus = bonus;
    }

    public void makeStrategicPlan(){
        System.out.println("Director makes a strategic plan for the company!");
    }
}

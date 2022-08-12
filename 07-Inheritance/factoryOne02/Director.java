package OOP.chapter5.factory1;

public class Director extends Manager{
    protected double bonus;

    public static final int DIRECTOR_PAYMENT = 20000;  //sabite

    public Director(int no, String name, int year, String department, String departmentManaged, double bonus) {
        super(no, name, year, department, departmentManaged);  //calls "parent's constructor" with 'super()'
        this.bonus = bonus;
        System.out.println("in Director() constructor");
    }
}

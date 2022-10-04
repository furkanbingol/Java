package OOP.chapter7_polymorphism.upcasting;

import OOP.chapter5.factory3.Employee;

public class PayrollOffice {

    public void paySalary(Employee e1) {
        double salary = e1.calculateSalary();
        System.out.println("Salary: " + salary + ", Who: " + e1.getName());
    }
}

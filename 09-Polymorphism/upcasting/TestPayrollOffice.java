package OOP.chapter7_polymorphism.upcasting;

import OOP.chapter5.factory3.Director;
import OOP.chapter5.factory3.Employee;
import OOP.chapter5.factory3.Manager;

public class TestPayrollOffice {
    public static void main(String[] args) {
        PayrollOffice payrollOffice = new PayrollOffice();

        Employee e1 = new Employee(1, "Ali", 8, "Production");
        payrollOffice.paySalary(e1);    //Employee e = e1;

        Manager m1 = new Manager(2, "Fatma", 3, "Production", "Production");
        payrollOffice.paySalary(m1);    //Employee e = m1;

        Director d1 = new Director(3, "Mehmet", 20, "Management", "Management", 3000);
        payrollOffice.paySalary(d1);    //Employee e = d1;

        Employee emp = e1;
        emp = m1;
        emp = d1;

        e1 = m1;  //polymorphic
        m1 = d1;  //polymorphic

        payrollOffice.paySalary(emp);
    }
}

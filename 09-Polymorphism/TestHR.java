package OOP.chapter7_polymorphism;

import OOP.chapter5.factory3.Employee;

public class TestHR {
    public static void main(String[] args) {
        HR hr = new HR();

        Employee e = hr.getAnEmployee();
        e.work();
        //A kind of Employee --> Hangi work methodunun çalışacağını bilemeyiz, Runtime'da görürüz.(Employee,Manager,Director)
    }
}

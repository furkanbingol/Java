package OOP.chapter7_polymorphism.downcasting;

import OOP.chapter5.factory3.*;
import OOP.chapter7_polymorphism.HR;

public class DowncastingExample {
    public static void main(String[] args) {
        //Upcasting
        Employee e1 = new Employee(5, "İsmail", 14, "Production");
        e1 = new Manager(5, "İsmail", 14, "Production", "Production");

        Employee e2 = new Employee(1, "Ali", 4, "Production");
        //Manager m2 = (Manager) e2;  //RUNTIME ERROR(ClassCastException)
        //m2.manage();

        //Director d1 = (Director) new Manager(5, "Furkan", 14, "Production", "Production");  //RUNTIME ERROR(ClassCastException)

        HR hr = new HR();
        Employee e = hr.getAnEmployee();

        //AVOID ClassCastException --> instanceof
        if (e instanceof Director) {      //en özel tip, en yukardaki if'te olmalı!
            Director d2 = (Director) e;
            d2.makeStrategicPlan();
        }
        else if (e instanceof  Manager) {
            Manager m3 = (Manager) e;
            m3.manage();
        }
        else
            e.work();
    }
}

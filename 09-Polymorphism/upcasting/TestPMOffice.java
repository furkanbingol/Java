package OOP.chapter7_polymorphism.upcasting;

import OOP.chapter5.factory3.Director;
import OOP.chapter5.factory3.Employee;
import OOP.chapter5.factory3.Manager;

public class TestPMOffice {
    public static void main(String[] args) {
        PMOffice client = new PMOffice();

        Manager m1 = new Manager(1, "Furkan",5, "Production", "Production");
        client.manageProject("ARGE",m1);                 //OK

        Director d1 = new Director(2, "Kevin", 3, "Marketing", "Marketing", 3000);
        client.manageProject("Marketing Project",d1);    //OK, polymorphic

        Employee e1 = new Employee(3, "Lauress", 10, "Recruiting");
        //client.manageProject(e1);  //ERROR


    }
}

package OOP.chapter7_polymorphism.upcasting;

import OOP.chapter5.factory3.Manager;

public class PMOffice {   //PMOffice CANNOT call an Employee Interface
    public void manageProject(String projectName, Manager m) {
        m.manageProject(projectName);
    }
}

package OOP.chapter9_interfaces.factory2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        HR hr = new HR();
        Employee[] employees = new Employee[10];
        for(int i = 0; i < 10; i++)
            employees[i] = hr.getAnEmployee();

        System.out.print("##############Before sorting##############");
        for(Employee e : employees)
            e.printInfo();
        System.out.print("\n##############After sorting##############");
        Arrays.sort(employees);
        for(Employee e : employees)
            e.printInfo();
    }
}

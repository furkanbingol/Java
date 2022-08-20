package OOP.chapter5.ObjectClass;

import OOP.chapter5.ObjectClass.domain.Car;

public class toStringExample {
    public static void main(String[] args) {
        Car c1 = new Car("Mercedes","CLK200","2018",200,4100);

        System.out.println(c1);              //same
        System.out.println(c1.toString());   //same
        System.out.println("c1.hashCode(): " + c1.hashCode());
        System.out.println("c1.getClass(): " + c1.getClass());
        System.out.println("c1.getClass().getName(): " + c1.getClass().getName());

        System.out.println();

        Car c2 = new Car("BMW","3.20","2016",0,4100);
        System.out.println(c2);              //same
        System.out.println(c2.toString());   //same
        System.out.println("c2.hashCode(): " + c2.hashCode());
    }
}

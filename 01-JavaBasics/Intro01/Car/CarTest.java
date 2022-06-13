package Basics.Intro01.Car;

public class CarTest {
    public static void main(String[] args) {  //String[] args == String args[] == String ... args
        Car car1 = new Car();
        //creating an instance from "Car" class
        //new Car()  -->  object
        //car1       -->  reference

        System.out.println("When the car stands still.");
        car1.make = "Mercedes";
        car1.model = "C200";
        car1.year = "2019";
        car1.distance = 0;
        car1.speed = 0;
        System.out.println(car1.getInfo());

        System.out.println("\nWhen the car moves.");
        car1.accelerate(125);
        car1.go(100);
        car1.go(50);
        System.out.println(car1.getInfo());

        System.out.println("\nWhen the car stops.");
        car1.stop();
        System.out.println(car1.getInfo());

        System.out.println("---------------------------------------");
        Car car2 = new Car();
        car2.make = "BMW";
        car2.model = "i8";
        car2.year = "2017";
        car2.distance = 10_000;
        car2.speed = 160;
        System.out.println(car2.getInfo());

        car2.accelerate(220);
        double timeToGo = car2.go(1000);
        System.out.println("Time to go 1000 km: " + timeToGo + " hours");
        System.out.println(car2.getInfo());
    }
}

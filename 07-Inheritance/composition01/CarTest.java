package OOP.chapter5.composition;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("Mercedes", "CLK 200", "2013", 2);
        car.start();
        car.go(1000);
        car.accelerate(70);
        System.out.println(car.getInfo());
        car.stop();
        car.turnOff();
    }
}

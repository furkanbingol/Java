package OOP.chapter5.ObjectClass.domain;

public class Car {      //  == public class Car extends Object
    public String make;
    public String model;
    public String year;
    public int speed;
    public int distance;

    public Car(String make, String model, String year, int speed, int distance) {
        this.make = make;
        this.year = year;
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.distance = distance;
    }

    public double go(int newDistance) {
        distance += newDistance;
        double period = (double )newDistance / speed;
        return period;
    }

    public void accelerate(int newSpeed) {
        speed = newSpeed;
    }

    public void stop() {
        speed = 0;
    }

    public String getInfo() {
        String info = "Car Info: " + year + " " + make + " " + model + ". Distance: " + distance + " km. and traveling at " + speed + " kmph.";
        return info;
    }

    @Override
    public String toString() {
        String s = "";
        s += "\nCar Info\n";
        s += "Make: " + make + "\n";
        s += "Model: " + model + "\n";
        s += "Year: " + year + "\n";
        s += "Distance: " + distance + "\n";
        s += "Speed: " + speed + " kmph. \n";
        return s;
    }
}

package OOP.chapter5.composition;

public class Car {
    private String make;
    private String model;
    private String year;
    private int speed;
    private int distance;

    private Wheel[] wheels = new Wheel[4];
    private Engine engine;
    private int doorCount;
    private Door[] doors;
    private Transmission transmission;

    public Car(String make, String model, String year, int doorCount) {
        this.make = make;
        this.model = model;
        this.year = year;

        engine = new Engine(2300, 175);
        transmission = new Transmission();

        wheels[0] = new Wheel("Left-front");
        wheels[1] = new Wheel("Right-front");
        wheels[2] = new Wheel("Left-rear");
        wheels[3] = new Wheel("Right-rear");

        this.doorCount = doorCount;
        doors = new Door[this.doorCount];
        doors[0] = new Door("Left-front");
        doors[1] = new Door("Right-front");

        if(this.doorCount == 4){
            doors[2] = new Door("Left-rear");
            doors[3] = new Door("Right-rear");
        }
    }

    public void start(){
        engine.start();
    }

    public void go(int newDistance){
        for(Door door : doors){
            if(!door.isClosed())
                door.close();
        }
        System.out.println("Car is moving..");
        distance += newDistance;
        System.out.println("Distance: " + distance);
    }

    public void accelerate(int newSpeed){
        speed = newSpeed;
        System.out.println("Accelerating. New speed: " + speed);
    }

    public void stop(){
        speed = 0;
        System.out.println("Car stopped. New speed: " + speed);
    }

    public String getInfo(){
        return "Car Info: " + year + " " + make + " " + model + " " + distance + " " + speed + "kmph.";
    }

    public void turnOff(){
        engine.stop();
    }
}

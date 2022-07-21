public class Car {
    String make;
    String model;
    String year;
    int speed;
    int distance;
    Person owner;   //default value: null

    public void go(int newDistance){
        distance += newDistance;
    }

    public void accelerate(int newSpeed){
        speed = newSpeed;
    }

    public void stop(){
        speed = 0;
    }

    public String getInfo(){
        String info = "Car info: " + year + " " + make + " " + model + ". Distance: " + distance + " km. and travelling at " + speed + " kmph.";
        if(owner != null)
            info += " And its owner is: " + owner.firstName + " " + owner.lastName;
        else
            info += " And does not have an owner!";
        return info;
    }
}

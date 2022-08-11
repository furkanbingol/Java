package OOP.chapter5.composition;

public class Engine {
    private int volume;
    private int horsePower;

    public Engine(int volume, int horsePower) {
        this.volume = volume;
        this.horsePower = horsePower;
        System.out.println("A engine is created. Volume is " + volume + " cc and horse power is " + horsePower);
    }

    public void start(){
        System.out.println("\nEngine started.");
    }

    public void stop(){
        System.out.println("Engine stopped.");
    }
}

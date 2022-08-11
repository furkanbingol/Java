package OOP.chapter5.composition;

public class Transmission {

    public Transmission(){ //constructor
        System.out.println("A transmission is creaeted");
    }

    public void forward(){
        System.out.println("Transmission is is set for forward.");
    }

    public void backward(){
        System.out.println("Transmission is is set for backward.");
    }
}

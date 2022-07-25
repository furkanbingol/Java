public class DontRepeatYourself {
    String type;
    float height;

    public DontRepeatYourself(String type, float height) {  //MAIN CONSTRUCTOR
        this.type = type;
        this.height = height;
    }

    public DontRepeatYourself(String type) {
        this(type,1.0f);     //this(): sadece constructorlarda çağrılabilir
    }

    public DontRepeatYourself(float height) {
        this("Oak",height);  //thanks to this()
    }

    public DontRepeatYourself() {
        this("Pine",1.0f);   //thanks to this()
    }

    public void printInfo() {
        System.out.println("\nTree Info:");
        System.out.println("Type: " + type);
        System.out.println("Height: " + height);
    }


    public static void main(String[] args) {
        DontRepeatYourself t1 = new DontRepeatYourself();
        t1.printInfo();

        DontRepeatYourself t2 = new DontRepeatYourself("Oak",15f);
        t2.printInfo();
    }
}

import java.time.LocalTime;

public class IntroductionToInitializationBlocks {
    String name;
    double coefficient;
    static int ratio;

    //initialization block for 'instance variables'  (if the object exists, this block runs)
    {
        name = "Furkan";
        LocalTime now = LocalTime.now();
        if(now.isBefore(LocalTime.NOON))
            coefficient = 2;
        else
            coefficient = 4;
    }

    //initialization block for 'class variables'  (not need to an object)
    static {
        ratio = (int)(Math.random() * 100);  //0-100
    }


    public static void main(String[] args) {
        System.out.println(ratio);
        System.out.println(IntroductionToInitializationBlocks.ratio);

        IntroductionToInitializationBlocks object = new IntroductionToInitializationBlocks();
        System.out.println(object.name);
        System.out.println(object.coefficient);
    }
}

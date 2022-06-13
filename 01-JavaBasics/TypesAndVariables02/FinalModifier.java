package Basics.TypesAndVariables02;

public class FinalModifier {
    public static void main(String[] args) {
        final int i = 5;
        //i = 8;      compile ERROR!

        final int j;  //blank final
        j = 8;
        //j = -3;     compile ERROR!

        /*
        final Car c = new Car();
        //c = new Car();     compile ERROR!

        final Car d;
        d = new Car();
        //d = new Car();     compile ERROR!
         */
    }
}

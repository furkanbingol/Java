package Basics.TypesAndVariables02;

public class FloatingPoints {
    public static void main(String[] args) {
        System.out.println("in doFPCalculation()");

        float fSum6 = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;   //0.6
        System.out.println("fSum6: " + fSum6);

        float fSum7 = fSum6 + 0.1f;     //0.70000005
        System.out.println("fSum7: " + fSum7);

        float fSum8 = fSum7 + 0.1f;     //0.80000001
        System.out.println("fSum8: " + fSum8);

        float fSum9 = fSum8 + 0.1f;     //0.90000001
        System.out.println("fSum9: " + fSum9);

        float fSum10 = fSum9 + 0.1f;    //1.00000001
        System.out.println("fSum10: " + fSum10);

        System.out.println();

        float f20 = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
        System.out.println("0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f = " + f20);
        System.out.println("Sum of 10 times 0.1 as float:  " + f20);

        double d20 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        System.out.println("0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 = " + d20);
        System.out.println("Sum of 10 times 0.1 as double:  " + d20);

        System.out.println();

        float floatSum = 0.0f;

        for (int i = 0; i < 100; i++) {
            floatSum = floatSum + 0.1f;
        }

        System.out.println("Sum of 100 times 0.1 as float:  " + floatSum);

        double doubleSum = 0.0d;

        for (int i = 0; i < 100; i++) {
            doubleSum = doubleSum + 0.1;
        }

        System.out.println("Sum of 100 times 0.1 as double:  " + doubleSum);
        System.out.println();

        System.out.println("0.1 * 0.1 = " + (0.1d * 0.1d));

        System.out.println("\n" + Integer.parseInt("14",16));    //20

        String s = "10000";
        int x = Integer.parseInt(s);
        System.out.println(x + 5);

        // Overflows
        double lowestInt = -Math.pow(2, 31);
        double highestInt = Math.pow(2, 31) - 1;
        System.out.println("Range of int is from " + lowestInt + " to " + highestInt);
    }
}

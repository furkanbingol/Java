package Basics.FlowControl04.homeworks;

import java.util.Scanner;

public class PiWithMonteCarlo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of points: ");
        int n = scan.nextInt();
        int numberInCircle = 0;
        double myPI;

        long start = System.currentTimeMillis();
        for(int i = 0; i < n; i++){
            double x = Math.random();  //0.0 - 1.0
            double y = Math.random();
            double distance = Math.sqrt(x * x + y * y);
            if(distance <= 1)
                numberInCircle++;
        }
        long end = System.currentTimeMillis();

        myPI = 4.0 * numberInCircle / n;
        System.out.println("My Pi: " + myPI);
        System.out.println("Original Pi: " + Math.PI);
        System.out.println("Time: " + (end-start) + " ms.");
    }
}

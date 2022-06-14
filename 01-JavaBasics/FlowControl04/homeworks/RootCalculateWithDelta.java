package Basics.FlowControl04.homeworks;
import java.util.Scanner;

//ax^2 + bx + c = 0

public class RootCalculateWithDelta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        double delta,x1,x2;

        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Enter the a,b and c respectively: ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        delta = b*b - 4*a*c;
        if(delta < 0)
            System.out.println("Delta is negative!");
        else{
            x1 = (-b + Math.sqrt(delta)) / (2*a);
            x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        }
    }
}

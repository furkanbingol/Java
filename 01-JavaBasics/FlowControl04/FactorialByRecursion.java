package Basics.FlowControl04;

import java.util.Scanner;

public class FactorialByRecursion {
    public static void main(String[] args) {
        FactorialByRecursion recursion = new FactorialByRecursion();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer number to calculate its factorial: ");
        int number = scan.nextInt();

        if(number < 0)
            System.out.println("Number must be a positive integer!");
        else{
            long fact = recursion.calculateFactorial(number);
            System.out.println("Factorial of " + number + " is: " + fact);
        }
    }

    public long calculateFactorial(int n){
        if(n == 0 || n == 1)
            return 1;
        else
            return n * calculateFactorial(n-1);
    }
}

package Basics.FlowControl04;
import java.util.Scanner;
//1 1 2 3 5 8 13 21 34 55 89 144 ...

public class FibonacciByRecursion {
    public static void main(String[] args) {
        FibonacciByRecursion fibo = new FibonacciByRecursion();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the index of the element you want in the Fibonacci Array(1-indexing): ");
        int n = scan.nextInt();

        if(n <= 0)
            System.out.println("Error!");
        else{
            long fib = fibo.calculateFibonacci(n);
            System.out.println("Output is: " + fib);
        }
    }

    public long calculateFibonacci(int n){
        if(n == 1 || n == 2)
            return 1;
        else
            return calculateFibonacci(n-1) + calculateFibonacci(n-2);
    }
}

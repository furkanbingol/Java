package Basics.FlowControl04.homeworks;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        PrimeNumbers obj = new PrimeNumbers();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the limit(including): ");
        int limit = scan.nextInt();
        int i = 1;

        if(limit <= 0)
            System.out.println("Error! Please enter a valid limit.");
        else{
            while(i <= limit){
                if(obj.isPrime(i))
                    System.out.println(i + " is prime!");
                else
                    System.out.println(i + " isn't prime!");
                i++;
            }
        }
    }

    public boolean isPrime(int n) {
        int sqrtOfN = (int)Math.sqrt(n);

        //if(n < 2) return false;
        if(n == 2) return true;
        if(n == 1) return false;

        for(int i = 2; i <= sqrtOfN; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
}

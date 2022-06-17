package Arrays.homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        SieveOfEratosthenes soe = new SieveOfEratosthenes();
        System.out.println("Please enter a positive integer: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        Arrays.fill(arr, 1);       //1: all of them 'prime number', 0: not a prime number
        soe.countNumberOfPrimesUpTo(arr);
    }

    void countNumberOfPrimesUpTo(int[] arr){
        int count = 0;
        arr[0] = 0; //0 isn't a prime number
        arr[1] = 0; //1 isn't a prime number

        for(int i = 2; i < arr.length; i++){
            if(arr[i] == 1) {
                for (int j = i; j < arr.length; j += i) {
                    if (j != i && arr[j] == 1) {
                        arr[j] = 0;
                    }
                }
            }
        }

        System.out.println("Primes: ");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nNumber of Primes up to N: " + count);
    }
}

package Arrays.homeworks;

import java.util.Scanner;

public class FindPrimeDivisor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int number = scan.nextInt();

        if(number < 2)
            System.out.println("Error!");
        else{
            System.out.println("Prime Divisors: ");
            int divisor = 2;
            while(number != 1){
                if(isPrime(divisor) && number % divisor == 0){
                    System.out.print(divisor + " ");
                    while(number % divisor == 0)
                        number /= divisor;
                }
                divisor++;
            }
        }
    }

    public static boolean isPrime(int n){
        int sqrtOfN = (int)Math.sqrt(n);

        for(int i = 2; i <= sqrtOfN; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
}

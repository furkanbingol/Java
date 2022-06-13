package Basics.FlowControl04;

import java.util.Scanner;

public class AgePeriods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        if(age >= 0 && age <= 3){
            System.out.println("You are baby");
        }
        else if(age >= 4 && age <= 12){
            System.out.println("You are child");
        }
        else if(age >= 13 && age <= 19){
            System.out.println("You are adolescent");
        }
        else if(age >= 20 && age <= 30){
            System.out.println("You are young");
        }
        else if(age >= 31 && age <= 59){
            System.out.println("You are adult");
        }
        else if(age >= 60 && age <= 120){
            System.out.println("You are old");
        }
        else{
            System.out.println("Error!");
        }
    }
}

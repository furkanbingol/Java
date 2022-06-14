package Basics.FlowControl04.homeworks;

import java.util.Scanner;

public class SeperateWithStar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scan.next();

        for(int i = 0; i < string.length(); i++){
            if(i != string.length()-1)
                System.out.print(string.charAt(i) + "*");
            else
                System.out.print(string.charAt(i));
        }
    }
}

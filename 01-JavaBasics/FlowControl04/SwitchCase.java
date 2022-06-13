package Basics.FlowControl04;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("A number for a month: ");
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();

        final int i = 1; //constant(degismez) variable olursa şayet, switch-case'de kullanılabilir

        switch(month){
            case i: System.out.println("January"); break;  // = case 1 -> System.out.println("January");
            case 2: System.out.println("February"); break;
            case 3: System.out.println("March"); break;
            case 4: System.out.println("April"); break;
            case 5: System.out.println("May"); break;
            case 6: System.out.println("June"); break;
            case 7: System.out.println("July"); break;
            case 8: System.out.println("August"); break;
            case 9: System.out.println("September"); break;
            case 10: System.out.println("October"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December"); break;
            default : System.out.println("Error!"); break;
        }
        System.out.println("*********************************************");
        
        String monthInString = switch(month){
            case 1: yield "January";
            case 2: yield "February";
            default: yield "Error!";
        };

        System.out.println("Month: " + monthInString);
    }
}

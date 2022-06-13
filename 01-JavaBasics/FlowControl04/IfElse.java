package Basics.FlowControl04;

public class IfElse {
    public static void main(String[] args) {
        String testscore = args[0];       //Run --> Edit Configurations --> Program Arguments
        int score = Integer.parseInt(testscore);
        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Your grade is " + grade);

        if(grade < 'C')
            System.out.println("👏👏👏");

        if(grade == 'F')
            System.out.println("😩");
    }
}

package Basics.TypesAndVariables02;

public class Types {
    public static void main(String[] args) {
        char ch = 'A';
        System.out.println("Character: " + ch + " , its numeric value: " + (int)ch);   //type-casting

        //ch = -5;  ERROR
        ch = (char) -5;       //65536 - 5 = 65531.character
        System.out.println("Character: " + ch + " , its numeric value: " + (int)ch);
    }
}

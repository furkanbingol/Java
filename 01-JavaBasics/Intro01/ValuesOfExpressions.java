package Basics.Intro01;

public class ValuesOfExpressions {
    public static void main(String[] args) {
        int k = 2_147_483_647;     //MAX limit of an int number in Java

        //int k = 2_147_483_648    //compile error
        int i = k + 1;             //compiler error VERMEZ. Expression İfadeler Runtime'da belirlenir. i'nin değeri YANLIS cıkacaktır(-2147...)
        System.out.println("value of i: " + i);

        int x;       //declaration
        int a = 15;  //definition
    }
}

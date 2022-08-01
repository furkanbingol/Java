package OOP.chapter3.importStatic;

import static java.lang.Math.*;

public class importMath {
    public static void main(String[] args) {
        int r = 5;

        double area1 = Math.PI * r * r;     //Old way
        double area2 = PI * r *r;           //New way "after import static"

        System.out.println(Math.pow(2,5));  //Old way
        System.out.println(pow(2,5));       //New way "after import static"
    }
}

package Basics.Operators03;

import java.util.*;

public class RelationalOperations {
    public static void main(String[] args) {

        Random rand = new Random();

        int i = rand.nextInt(101);    //1-100
        int j = rand.nextInt(101);    //1-100

        System.out.println("i: " + i);
        System.out.println("j: " + j);

        System.out.println("Greatest number is: " + (Math.max(i, j)));

        boolean b1 = true;
        boolean b2 = false;

        if(b1 == b2){
            System.out.println("They are same!");
        }
        else{
            System.out.println("They are different!");
        }
      
        /*
        "Java" + 1 + 2   ---> Java12
        "Java" + (1 + 2) ---> Java3
        1 + 2 + "Java"   ---> 3Java
        */
    }
}

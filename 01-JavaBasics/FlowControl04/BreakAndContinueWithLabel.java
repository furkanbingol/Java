package Basics.FlowControl04;

public class BreakAndContinueWithLabel {
    public static void main(String[] args) {
        int[][] arrayOfInts = { { 32, 87,   3,    589},
                                { 12, 1076, 2000,  12},
                                { 622, 127,  12,   12} };

        int searchFor = 12;
        int i,j;
        boolean foundIt = false;

        here: for(i = 0; i < arrayOfInts.length; i++){         //here: LABEL
            for(j = 0; j < arrayOfInts[i].length; j++){
                if(arrayOfInts[i][j] == searchFor){
                    foundIt = true;
                    System.out.println("Found " + searchFor + " at " + i + ", " + j);
                    break here;
                }
            }
        }
        if(!foundIt){
            System.out.println(searchFor + " not in the array");
        }
    }
}

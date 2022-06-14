package Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[][] a = {{ 1, 2, 3 ,9, 0 ,3, 8},
                     { 4, 1, 6, 7, 5}};

        System.out.println("a's length: " + a.length);
        System.out.println("a[0]'s length: " + a[0].length);
        System.out.println("a[1]'s length: " + a[1].length);

        int[][] coordinates = {{3, 7} , {13, 2} , {8,5}};

        int[] c1 = coordinates[0];    // {3,7}
        int[] c2 = coordinates[0];    // {13,2}
        int[] c3 = coordinates[0];    // {8,5}

        System.out.println("Printing coordinates: ");
        print(coordinates);

        System.out.println("*****************************************");

        int[][] b = new int[2][];
        b[0] = new int[3];
        b[1] = new int[5];

        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b[i].length; j++){
                b[i][j] = (int)(Math.random() * 10);
            }
        }
        System.out.println("Printing b: ");
        print(b);
    }

    public static void print(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}

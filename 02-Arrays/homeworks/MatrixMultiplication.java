package Arrays.homeworks;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rowFirst,colFirst,rowSecond,colSecond;

        System.out.println("Ilk matrisin satir ve sütun sayısını giriniz: ");
        rowFirst = scan.nextInt();
        colFirst = scan.nextInt();
        System.out.println("Ikinci matrisin satir ve sütun sayısını giriniz: ");
        rowSecond = scan.nextInt();
        colSecond = scan.nextInt();

        int[][] firstArr = new int[rowFirst][colFirst];
        int[][] secondArr = new int[rowSecond][colSecond];

        if(colFirst != rowSecond)
            System.out.println("Hata! Ilk matrisin sütun sayısı, ikinci matrisin satir sayısına eşit olmadıgı icin carpim yapılamaz");
        else{
            int[][] multiplication = new int[rowFirst][colSecond];

            System.out.println("İlk dizinin elemanlarını giriniz: ");
            for(int i = 0; i < rowFirst; i++){
                for(int j = 0; j < colFirst; j++){
                    firstArr[i][j] = scan.nextInt();
                }
            }
            System.out.println("\nİkinci dizinin elemanlarını giriniz: ");
            for(int i = 0; i < rowSecond; i++){
                for(int j = 0; j < colSecond; j++){
                    secondArr[i][j] = scan.nextInt();
                }
            }
            System.out.println("\n***********************************");

            for(int i = 0; i < rowFirst; i++){
                for(int j = 0; j < colSecond; j++){
                    for(int k = 0; k < colFirst; k++){
                        multiplication[i][j] += firstArr[i][k] * secondArr[k][j];
                    }
                }
            }
            System.out.println("\nCarpim Matrisi: ");
            for(int i = 0; i < rowFirst; i++){
                for(int j = 0; j < colSecond; j++){
                    System.out.print(multiplication[i][j] + " ");
                }
                System.out.print("\n");
            }
        }
    }
}

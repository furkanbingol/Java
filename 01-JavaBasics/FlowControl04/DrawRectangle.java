package Basics.FlowControl04;

import java.util.Scanner;

public class DrawRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int satir,sutun,secim;
        int i,j;

        System.out.println("Satir sayisini giriniz: ");
        satir = scan.nextInt();
        System.out.println("Sütun sayisini giriniz: ");
        sutun = scan.nextInt();

        System.out.println("İçi dolu dikdörtgen için 1, içi boş dikdörtgen için 2: ");
        secim = scan.nextInt();


        if(secim != 1 && secim != 2){
            System.out.println("Hatali secim!");
        }
        else if(secim == 1){
            for(i = 0; i < satir; i++){
                for(j = 0; j < sutun; j++){
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
        else if(secim == 2){
            for(i = 0; i < satir; i++){
                for(j = 0; j < sutun; j++){
                    if(i == 0 || i == satir-1){
                        System.out.print("*");
                    }
                    else if(j == 0 || j == sutun-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");
            }
        }
    }
}

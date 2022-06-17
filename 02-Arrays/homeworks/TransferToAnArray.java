package Arrays.homeworks;

import java.util.Scanner;

public class TransferToAnArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Orjinal dizinin boyutunu giriniz: ");
        int n = scan.nextInt();
        int[] originalArray = new int[n];
        int[] newArray = new int[n];

        System.out.println("Elemanları giriniz: ");
        for(int i = 0; i < n; i++){
            int deger = scan.nextInt();
            originalArray[i] = deger;
        }

        int j = 0;
        for(int i = 0; i < n; i++){
            if(!isExist(originalArray,originalArray[i],i)){
                newArray[j] = originalArray[i];
                j++;
            }
        }

        System.out.println("Yeni Dizi: ");
        for(int i = 0; i < j; i++){
            System.out.print(newArray[i] + " ");
        }
    }

    public static boolean isExist(int[] originalArray, int deger, int index){
        for(int i = 0; i < index; i++){
            if(originalArray[i] == deger)
                return true;
        }
        return false;
    }
}

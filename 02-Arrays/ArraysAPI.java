package Arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysAPI {
    int[] intArray = new int[20];
    Pizza[] pizzalar = new Pizza[3];
    boolean[] flags = { true, false };

    public static void main(String[] args) {
        ArraysAPI demo = new ArraysAPI();
        demo.initialize();
        demo.copy();
        demo.copyRange();
        demo.fill(11);
        demo.sort();
        demo.search(5);
    }

    public void initialize() {
        for (int i = 0; i < intArray.length; i++) {
            Random r = new Random();
            int randomInt = r.nextInt();
            int sayi = randomInt % 100;   // -99 , +99
            intArray[i] = sayi;
        }

        System.out.print("Original array: ");
        print(intArray);

        pizzalar[0] = new Pizza("Peynirli");
        pizzalar[1] = new Pizza("Sucuklu");
        pizzalar[2] = new Pizza("Sebzeli");
    }

    public void copy() {
        System.out.println("\nCopying the array: ");
        int[] copy1 = Arrays.copyOf(intArray, intArray.length);   //Arrays sınıfı static'dir. O yüzden object'ini oluşturmadan çağırabiliriz!
        System.out.print("Whole copy: ");
        print(copy1);

        System.out.print("Only 0 to 4 copy: ");
        int[] copy2 = Arrays.copyOf(intArray, 5);
        print(copy2);
    }

    public void copyRange() {
        System.out.println("\nCopying the range of the array: ");
        int[] copy = Arrays.copyOfRange(intArray, 5, 15);   //5 inclusive, 15 exclusive
        System.out.print("Range 5 to 15 copy: ");
        print(copy);
    }

    public void fill(int key) {
        System.out.print("\nFilling an array with " + key + ": ");
        Arrays.fill(intArray, key);
        print(intArray);
    }

    public void sort() {
        System.out.print("\nSorting an array: ");
        Arrays.sort(intArray);
        print(intArray);
    }

    public void search(int key) {
        System.out.println("\nSearching " + key + " in an array");
        Arrays.sort(intArray);  //sorted
        print(intArray);
        int index = Arrays.binarySearch(intArray, key);   //the array must be sorted(binary search)
        System.out.println("Index of " + key + ": " + index);
    }

    public void print(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
    }
}

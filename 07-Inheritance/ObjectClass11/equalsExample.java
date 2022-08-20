package OOP.chapter5.ObjectClass;

import OOP.chapter5.ObjectClass.domain.Product;

public class equalsExample {
    public static void main(String[] args) {
        Product p1 = new Product(11, "Kanepe", 171.09);
        Product p2 = new Product(11, "Kan epe", 171.09);

        System.out.println("Is p1 == p2(reference): ");
        boolean b = (p1 == p2);
        if(b)
            System.out.println("The same");
        else
            System.out.println("Different");

        System.out.println("\nIs p1.equals(p2): ");
        b = p1.equals(p2);
        if(b)
            System.out.println("Values are same\n");
        else
            System.out.println("Values are different\n");

        System.out.println(p1);  //p1.toString()
        System.out.println(p2);  //p2.toString()
    }
}

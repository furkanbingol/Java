package OOP.chapter5.protectedModifier;

public class MainTest {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("Child Info");
        System.out.println("child.x: " + child.x);   // x is public
        System.out.println("child.y: " + child.y);   // y is default
        System.out.println("child.t: " + child.t);   // t is protected, it is accessible if Child inherits from Parent1. "It is NOT accessible if Child inherits from Parent2 because they are in DIFFERENT PACKAGES, 'Söz konusu olan erişim Child'in erişimi değil, MainTest sınıfının erişimi'"
//      System.out.println("child.z: " + child.z);   // z is private
    }
}

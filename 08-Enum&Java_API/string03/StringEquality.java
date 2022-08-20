package OOP.chapter6.string;

public class StringEquality {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");
        System.out.println(s1 == s2);      //false (different objects)

        String s3 = "Java";
        String s4 = "Java";  //not a new object!
        System.out.println(s3 == s4);      //true  (same objects)

        System.out.println(s1.equals(s2)); //true
        System.out.println(s3.equals(s4)); //true
    }
}

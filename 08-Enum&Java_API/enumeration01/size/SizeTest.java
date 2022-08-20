package OOP.chapter6.enumeration.size;

public class SizeTest {
    public static void main(String[] args) {
        Size size1 = Size.LARGE;
        System.out.println("Enum: " + size1.name());         //from API
        System.out.println("Ordinal: " + size1.ordinal());   //from API
        System.out.println("Abbrevation: " + size1.getAbbr());
        System.out.println("No: " + size1.getNo());

        System.out.println(Size.getDescription());
    }
}

package OOP.chapter6.wrapper;

public class Wrappers {
    public static void main(String[] args) {
        trying();
    }

    public static void trying(){
        int i = 8;
        Integer iObject = new Integer(i);   //deprecated
        System.out.println(iObject);

        boolean b = false;
        Boolean bObject = b;
        System.out.println(bObject);

        int i2 = Integer.parseInt("18");
        System.out.println(i2);

        String str = "false";
        boolean b1 = Boolean.parseBoolean(str);
        System.out.println(b1);
    }
}

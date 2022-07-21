public class PrimitiveOverloading1 {
    //OVERLOADING

//    static void f1(byte x){
//        System.out.println("f1(byte)");
//    }
    static void f1(short x){
        System.out.println("f1(short)");
    }
    static void f1(char x){
        System.out.println("f1(char)");
    }
    static void f1(int x){
        System.out.println("f1(int)");
    }
    static void f1(long x){
        System.out.println("f1(long)");
    }
    static void f1(float x){
        System.out.println("f1(float)");
    }
    static void f1(double x){
        System.out.println("f1(double)");
    }

    public static void main(String[] args) {
        byte b = 3;
        short s = 4;
        char c = 'a';
        int i = 5;
        long l = 5L;
        float f = 5.0F;
        double d = 6.0D;

        f1(b);  //byte tipinde parametre alan olmadığı için byte'ın bir üstüne promote eder.("short" f'i çağrılır).
        f1(s);
        f1(c);
        f1(i);
        f1(l);
        f1(f);
        f1(d);
    }
}

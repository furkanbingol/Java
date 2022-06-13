package Basics.TypesAndVariables02;

public class ComplexDataTypes {
    static int y;  //class variable

    public static void main(String[] args) {  //Mainde tanımladığımız degiskenler "YEREL DEGİSKENLERDİR"
        //primitive dataTypes
        int i = 5;
        int j = i;

        //complex dataTypes
        String s1 = new String("a");
        String s2 = "b";
        String tmp;
        tmp = s1;     //Artık tmp referansı, s1'in tuttuğu nesneyi tutuyor.         tmp --> "a"
        s1 = s2;      //Artık s1 referansı, s2'nin tuttuğu nesneyi tutuyor.         s1  --> "b"
        s2 = tmp;     //Artık s2 referansı, tmp(s1)'nin tuttuğu nesneyi tutuyor.    s2  --> "a""
        System.out.println("s1: " + s1 + ", s2: " + s2);

        /* !Error!(initialize etmeliyiz referansı)
        String s5;
        System.out.println(s5); */


        String s6 = null;
        //s6.equals(s2);      #NullPointerException fırlatılır


        int x;
        //System.out.println(x);    !Error! (x is a MAIN method LOCAL VARIABLE. Method local variables need to be initialized before using them.

        System.out.println(y);      //In this example, y is CLASS MEMBER VARIABLE, hence it will be initialized to the default value(int-->0)
    }
}

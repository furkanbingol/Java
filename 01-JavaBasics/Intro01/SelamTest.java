package Basics.Intro01;

/**
 JavaDoc comments (API dokümantasyonu için kullanılır)
 @see <a href="http://www.google.com">Google</a>
 @author <a href="https://www.linkedin.com/in/furkanbingol/">Furkan Bingol</a>
 */

public class SelamTest {
    public static void main(String[] args) {
        Selam nesne = new Selam();

        String cevap = nesne.selamSoyle("Furkan");
        System.out.println(cevap);

        cevap = nesne.selamSoyle("");
        System.out.println(cevap);
        System.err.println(cevap);   //red output

        var x = 5;
        var a1 = "kevin";
    }
}

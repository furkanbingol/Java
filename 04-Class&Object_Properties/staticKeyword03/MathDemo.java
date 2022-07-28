public class MathDemo {
    public static void main(String[] args) {
        System.out.println("Math.PI: " + Math.PI);
        System.out.println("Math.E: " + Math.E);
        System.out.println();

        int i = 5;
        double j = Math.pow(2,i);
        System.out.println("j: " + j + "\n");

        int angle = 90;
        double degree = 90 * 2 * Math.PI / 360;  //radian(2*pi)
        System.out.println("Sin of 90 is: " + Math.sin(degree) + "\n");

        int k = -150;
        System.out.println("Abs of k: " + Math.abs(k) + "\n");

        int x = 144;
        System.out.println("Square root of x: " + Math.sqrt(x) + "\n");

        int y = 125;
        System.out.println("Cube root of y: " + Math.cbrt(y) + "\n");

        System.out.println("Random values between 0.0 and 1.0");
        for(int g = 0; g < 10; g++)
            System.out.println(Math.random());  //between 0.0 and 1.0
    }
}

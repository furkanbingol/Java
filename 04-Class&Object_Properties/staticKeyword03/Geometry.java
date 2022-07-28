public class Geometry {   //Geometry'nin nesnesini oluşturmaya gerek yok. Bu yüzden fieldlarını ve metotlarını "static" yapmalıyız.
    static final double PI = Math.PI;
    static final Point origin = new Point(0,0);

    public static double calculateAreaOfCircle(double r){  //static koymazsak, bu metotu çağırabilmek için Geometry'nin nesnesini oluşturmamız gerekirdi.
        return PI * r * r;
    }

    public static double calculateCircumferenceOfCircle(double r){
        return 2 * PI * r;
    }

    public static double calculateAreaOfARectangle(double width, double length){
        return width * length;
    }

    public static double calculateAreaOfATriangle(double base, double height){
        return 0.5 * base * height;
    }

    public static double calculateDistanceBetweenTwoPoints(Point p1, Point p2){
        double dist = Math.sqrt(Math.pow(p1.getX()-p2.getX(),2) + Math.pow(p1.getY()-p2.getY(),2));
        return dist;
    }

    public static double calculateDistanceToOrigin(Point p1){
        return calculateDistanceBetweenTwoPoints(p1, origin);
    }
}

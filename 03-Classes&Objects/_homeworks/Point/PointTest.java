public class PointTest {
    public static void main(String[] args) {
        Point point1 = new Point();
        point1.setX(4);
        point1.setY(3);

        System.out.println("Distance to origin: " + point1.distanceToOrigin());

        Point point2 = new Point();
        point2.setX(6);
        point2.setY(9);

        System.out.println("Distance to another point: " + point1.distanceToAnotherPoint(point2));

        Point point3 = point1.clone();
        System.out.println("Cloned point; x: " + point3.getX() + " , y: " + point3.getY());

        point1.move('x',6);
        point2.move('y',11);
    }
}

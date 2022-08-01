package OOP.chapter3.importing;

import OOP.chapter2.staticKeyword.Point;  //importing from another package

public class MainTest {
    public static void main(String[] args) {
        Point point = new Point(3,4);
        Point origin = new Point(0,0);

        System.out.println(point.distanceToAnotherPoint(origin)); //5.0
    }
}

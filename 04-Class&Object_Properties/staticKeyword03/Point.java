public class Point {
    int x;
    int y;

    public Point(int x, int y) {  //constructor
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distanceToOrigin(){
        double distance;
        distance = Math.sqrt(x*x + y*y);
        return distance;
    }

    public double distanceToAnotherPoint(Point p){
        double distance;
        distance = Math.sqrt((x-p.x)*(x-p.x) + (y-p.y)*(y-p.y));
        return distance;
    }

    public Point clonePoint(){
        Point newPoint = new Point(x,y);
        return newPoint;
    }

    public void move(char coordinate, int distance){
        if(coordinate == 'x'){
            setX(x + distance);
            System.out.println("New coordinates; x: " + getX() + ", y: " + getY());
        }
        else if(coordinate == 'y'){
            setY(y + distance);
            System.out.println("New coordinates; x: " + getX() + ", y: " + getY());
        }
        else
            System.out.println("Error! Coordinate must be 'x' or 'y'");
    }
}

public class Circle {
    float r;

    public Circle(){         //default constructor
        this(10);
    }

    public Circle(float r){  //overloaded constructor
        this.r = r;
    }

    public double areaOfTheCircle(){
        return (Math.PI * r * r);
    }

    public double circumferenceOfTheCircle(){
        return (2 * Math.PI * r);
    }


    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Default circle circumference: " + c1.circumferenceOfTheCircle());
        System.out.println("Default circle area: " + c1.areaOfTheCircle());

        Circle c2 = new Circle(5);
        System.out.println("\n(r=5) Circle circumference: " + c2.circumferenceOfTheCircle());
        System.out.println("(r=5) Circle area: " + c2.areaOfTheCircle());
    }
}

public class TestMain {
    public static void main(String[] args) {
        Person furkan = new Person();
        furkan.tckn = "1";
        furkan.firstName = "Furkan";
        furkan.lastName = "Bingol";

        Car mercedes = new Car();
        mercedes.make = "Mercedes";
        mercedes.model = "E200";
        mercedes.speed = 80;
        mercedes.distance = 30000;
        mercedes.year = "2011";

        System.out.println(mercedes.getInfo());  //mercedes.owner   is null
        System.out.println(furkan.getInfo());    //furkan.vehicle   is null

        mercedes.owner = furkan;
        furkan.vehicle = mercedes;

        System.out.println("*********************************************");
        System.out.println(mercedes.getInfo());
        System.out.println(furkan.getInfo());
    }
}

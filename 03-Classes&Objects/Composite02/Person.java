public class Person {
    String tckn;
    String firstName;
    String lastName;
    Car vehicle;        //default value: null

    public String getInfo(){
        String info = "Person info: " + tckn + " " + firstName + " " + lastName;
        if(vehicle != null)
            info += " And has a car: " + vehicle.getInfo();
        else
            info += " And has no car";
        return info;
    }
}

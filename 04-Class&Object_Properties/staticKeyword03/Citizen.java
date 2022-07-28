import java.util.Date;

public class Citizen {
    String tckn;
    String firstName;
    String lastName;
    Date dateOfBirth;
    String placeOfBirth;
    String fatherName;
    String motherName;
    char sex;
    static String nationality; //class variable(static)

    public static String getNationality() {
        return nationality;
    }


    public static void main(String[] args) {
        Citizen c1 = new Citizen();
        c1.tckn = "11111111";
        c1.firstName = "Furkan";
        c1.lastName = "Bingöl";

        Citizen c2 = new Citizen();
        c2.tckn = "22222222222";
        c2.firstName = "Jonathan";
        c2.lastName = "Lee";

        Citizen.nationality = "Turkiye Cumhuriyeti";  //sınıfınReferansı.nationality
        //Aynı sınıf üzerinde, bir static metot(main), bir başka static metotu veya static propertiesi DİREKT olarak çağırabilir! (nationality = "...";)

        System.out.println("Nationality: " + Citizen.nationality);
        System.out.println("Nationality: " + c1.nationality);   //(warning) static member accessed via instance reference
        System.out.println("Nationality: " + c2.nationality);   //(warning) static member accessed via instance reference
    }
}

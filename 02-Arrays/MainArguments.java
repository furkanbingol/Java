package Arrays;

public class MainArguments {
    public static void main(String[] args) {

        if(args.length == 3){
            String name = args[0];
            String lastName = args[1];
            String age = args[2];
            System.out.println(name + " " + lastName + " " + age);
        }
        else{
            System.out.println("Hata! Lütfen 3 argüman giriniz!");
        }

        int integerAge = Integer.parseInt(args[2]);
        System.out.println("Integer olarak age: " + integerAge);
    }
}

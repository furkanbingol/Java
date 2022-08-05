package OOP.chapter4.SingletonClass;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        Singleton singleton2 = Singleton.getInstance();

        //Singleton s = new Singleton();   //Constructor private oldugu için, baska sınıftan newlenemez!

        if(singleton == singleton2)
            System.out.println("Aynı nesne referans ediliyor! Singleton Prensip");

        System.out.println("singleton :" + singleton.hashCode() + ", singleton2 :" + singleton2.hashCode());
    }
}

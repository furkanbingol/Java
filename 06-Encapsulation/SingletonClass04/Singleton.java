package OOP.chapter4.SingletonClass;

public class Singleton {
    private static Singleton instanceOfSingleton;

    static  //sınıf init edilirken, bir adet nesne init edilecek ve o NESNE ARTIK TEK NESNE OLACAK(singleton)
    {
        instanceOfSingleton = new Singleton();
    }

    private Singleton(){  //private constructor(başka sınıftan new'lenemez)

    }

    public static Singleton getInstance() {
        return instanceOfSingleton;
    }
}

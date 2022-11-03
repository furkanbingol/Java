package OOP.chapter9_interfaces.InterfaceExtend;

public interface HardWorker extends Worker{

    void workHard();
}

/*
Eğer herhangi bir class, HardWorker'i implements ederse,
hem "workHard()" metotuna implement vermeli,
hemde Worker'daki "work()" metotuna implement vermelidir!
 */
package OOP.chapter9_interfaces.InterfaceMultiExtending;

public interface ABiggerInterface extends AnInterface,AnotherInterface{

    void doMore();
}

/*
Eğer bir class ABiggerInterface'i implements ederse,
hem ABiggerInterface'in
hem AnInterface'in
hem AnotherInterface'in
tüm metotlarını "implement" etmelidir!
 */
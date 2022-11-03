package OOP.chapter9_interfaces.InterfaceMultiExtending;

public class Tester implements ABiggerInterface{

    @Override
    public void doMore() {
        System.out.println("Coming from 'ABiggerInterface'");
    }

    @Override
    public void doThis() {
        System.out.println("Coming from 'AnInterface'");
    }

    @Override
    public void doThat() {
        System.out.println("Coming from 'AnotherInterface'");
    }
}

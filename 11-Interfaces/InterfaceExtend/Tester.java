package OOP.chapter9_interfaces.InterfaceExtend;

public class Tester implements HardWorker{

    @Override
    public void workHard() {
        System.out.println("Coming from 'HardWorker' interface!");
        work();
        work();
        work();
    }

    @Override
    public void work() {
        System.out.println("Coming grom 'Worker' interface!");
    }
}

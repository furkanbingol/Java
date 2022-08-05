package OOP.chapter4.fullyEncapsulated;

public class WindowTest {
    public static void main(String[] args) {
        Window w = new Window(false,5,8);

        System.out.println(w.isOpen());
        System.out.println(w.getWidth());
        System.out.println(w.getHeight());
        System.out.println(w.calculateArea());

        w.printInfo();
        w.setOpen(true);
        w.printInfo();
    }
}

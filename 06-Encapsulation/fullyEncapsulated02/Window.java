package OOP.chapter4.fullyEncapsulated;

public class Window {
    private boolean open;
    private int width;
    private int height;

    public Window(boolean open, int width, int height) {
        this.open = open;
        this.width = width;
        this.height = height;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void open(){
        open = true;
    }

    public void close(){
        open = false;
    }

    public int calculateArea(){
        return width * height;
    }

    public void printInfo(){
        System.out.println("Window; open: " + open + ", height: " + height
        + ", width: " + width + ", area: " + calculateArea());
    }
}

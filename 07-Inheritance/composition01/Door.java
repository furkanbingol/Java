package OOP.chapter5.composition;

public class Door {
    private String name;
    private boolean closed;

    public Door(String name) {
        this.name = name;
        System.out.println(name + " door is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public void open(){
        System.out.println(name + " door is open.");
    }

    public void close(){
        System.out.println(name + " door is closed.");
    }
}

package OOP.chapter5.ObjectClass.domain;

public class Product {
    int no;
    String name;
    double price;

    public Product(int no, String name, double price) {
        this.no = no;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [no=" + no + ", name=" + name + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object o) {
        Product p1 = (Product)o;  //downcasting
        if (no == p1.no && price == p1.price && name.equals(p1.name))
            return true;
        return false;
    }

    @Override
    public int hashCode(){
        return (no + (int) price + name.hashCode());
    }
}

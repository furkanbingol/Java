package OOP.chapter4.ImmutableObject;

//Functional Person Class
public final class Person {
    private final String no;
    private final String name;
    private Address address;

    public Person(String no, String name, Address address) {
        this.no = no;
        this.name = name;
        this.address = address;
    }

    public String getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {   //address DEĞİŞTİRİLEMEZ olduğu için, yeni bir address oluşturup ve onu KOPYALAYIP onu döndürmeliyiz.
        Address newAddress = new Address(address);
        return newAddress;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

package OOP.chapter4.ImmutableObject;

import java.util.Collections;
import java.util.List;

//Functional Address Class
public final class Address {     //final class: inherit ettiğimizde de, üyeleri değiştiremememizi sağlar.
    private final String name;   //private final variables: sadece getterlerı olur, setterları OLMAZ.
    private final List<String> streets;
    private final String city;
    private final String state;
    private final String zip;

    public Address(String name, List<String> streets, String city, String state, String zip) {  //constructor
        this.name = name;      //constructorda, final olan üyeler init edildi
        this.streets = streets;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Address(Address address){   //constructor
        this.name = address.name;
        this.streets = address.streets;
        this.city = address.city;
        this.state = address.state;
        this.zip = address.zip;
    }

    public String getName() {
        return name;
    }

    public List<String> getStreets() {
        return Collections.unmodifiableList(streets);
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }
}

import java.util.Date;

public class Employee {
    int id;
    String firstName;
    String lastName;
    Date birthDate;
    float salary;
    String department = "No department yet!";

    public Employee(int id, String firstName, String lastName, Date birthDate, float salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    public Employee(int id, String firstName, String lastName, Date birthDate, float salary, String department) {
        this(id, firstName, lastName, birthDate, salary);  //this(): must be in 'first line' in constructor
        this.department = department;
    }
}

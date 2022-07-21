public class InitialValues {
    //INSTANCE(OBJECT) VARIABLES
    boolean t;     // false
    char c;        // '' (int: 0)
    byte b;        // 0
    short s;       // 0
    int i;         // 0
    long l;        // 0L
    float f;       // 0.0F
    double d;      // 0.0D
    String str;    // null

    void print() {
        System.out.println(
        "Default Values of Instance variables:\n\n" +
        "Data type          Initial values for instance(object) variables\n" +
        "boolean                            " + t + "\n" +
        "char                               " + c + "\n" +
        "byte                               " + b + "\n" +
        "short                              " + s + "\n" +
        "int                                " + i + "\n" +
        "long                               " + l + "\n" +
        "float                              " + f + "\n" +
        "double                             " + d + "\n" +
        "String                             " + str);
    }

    public static void main(String[] args) {
        InitialValues object = new InitialValues();
        object.print();

        System.out.println("-------------------------------------------\n'" +
        "Local variables' doesn't have a default value! We must assign a value to local variables!");
    }
}

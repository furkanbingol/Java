package OOP.chapter6.enumeration.size;

enum Size {
    SMALL("S", 1), MEDIUM("M", 2), LARGE("L", 3), EXTRA_LARGE("XL", 4);

    private String abbr;
    private int no;

    private static String description;
    private static int count;

    static{
        System.out.println("in static initializer block");
        description = "These are sizes";
    }

    {
        //count++   //CANT'T DO THIS!(because, in ENUM: first instance blocks and constructors, then static blocks)
        System.out.println("in instance initializer block");
    }

    Size(String abbr, int no) {   //default constructor modifier for ENUM: private
        this.abbr = abbr;
        this.no = no;
    }

    public String getAbbr() {
        return abbr;
    }

    public int getNo() {
        return no;
    }

    public static String getDescription() {
        return description;
    }
}

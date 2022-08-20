package OOP.chapter6.enumeration.day;

public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public static void main(String[] args) {
        String nameOfDay = Day.FRIDAY.name();
        System.out.println(nameOfDay);

        int ordinal = Day.TUESDAY.ordinal();
        System.out.println("ordinal of Tuesday: " + ordinal);

        Day[] days = Day.values();
        for(Day day : days)
            System.out.println(day);

        System.out.println("\ntoString() of Day.MONDAY: " + Day.MONDAY.toString());  // ==Day.MONDAY
    }
}

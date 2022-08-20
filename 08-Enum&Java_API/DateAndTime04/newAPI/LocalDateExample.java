package OOP.chapter6.DateAndTime.newAPI;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        System.out.println("Day of month: " + today.getDayOfMonth());
        System.out.println("Day of week: " + today.getDayOfWeek());
        System.out.println("Day of year: " + today.getDayOfYear());
        System.out.println("Is leap year: " + today.isLeapYear());

        LocalDate tomorrow = today.plusDays(1);
        System.out.println("Tomorrow: " + tomorrow);
    }
}

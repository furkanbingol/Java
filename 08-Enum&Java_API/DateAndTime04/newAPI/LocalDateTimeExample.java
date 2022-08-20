package OOP.chapter6.DateAndTime.newAPI;

import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime todayNow = LocalDateTime.now();
        System.out.println(todayNow);

        System.out.println(todayNow.getHour());
        System.out.println(todayNow.getDayOfMonth());
    }
}

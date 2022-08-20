package OOP.chapter6.DateAndTime.oldAPI;

import java.util.Date;

public class DateExample {
    public static void main(String[] args) throws InterruptedException {
        Date now = new Date();
        System.out.println("now: " + now);
        now = nowAndThen(now);
        Thread.sleep(5*1000);  //~5s
        now = nowAndThen(now);
        Thread.sleep(5*1000);
        now = nowAndThen(now);
    }

    public static Date nowAndThen(Date then){
        Date now = new Date();
        System.out.println(then + " " + then.getTime());
        System.out.println(now + " " + then.getTime());
        System.out.println(now.after(then));   //true-false
        System.out.println(then.before(now));  //true-false
        return now;
    }
}

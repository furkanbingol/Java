package OOP.chapter6.enumeration.dateExample;

import OOP.chapter6.enumeration.dateExample.constants.DateConstants;
import OOP.chapter6.enumeration.dateExample.dateEnums.DayOfMonth;
import OOP.chapter6.enumeration.dateExample.dateEnums.Month;
import OOP.chapter6.enumeration.dateExample.dateEnums.Year;

public class DateTest {
    public static void main(String[] args) {
        Date1 d1 = new Date1(-2, 25, 123123123);

        Date2 d2 = new Date2("-8", "JANNUUary", "200019");

        Date3 d3 = new Date3(DateConstants.DAY_3, DateConstants.NOVEMBER, DateConstants.YEAR_2019);

        Date4 d4 = new Date4(DayOfMonth.DAY_3, Month.FEBRUARY, Year.YEAR_2017);
    }
}

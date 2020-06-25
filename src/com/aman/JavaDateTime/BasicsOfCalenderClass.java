package com.aman.JavaDateTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BasicsOfCalenderClass {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date t = calendar.getTime();
        System.out.println(t);

        // Calendar's get() method
        System.out.println("Current Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Current Date number: " + calendar.get(Calendar.DATE));
        System.out.println("Current Date number(by another method): "+calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Current Day name: "+ calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("Occurrence of current day in current month"+calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("Current MINUTE: " + calendar.get(Calendar.MINUTE));
        System.out.println("Current SECOND: " + calendar.get(Calendar.SECOND));

        // Calendar's getMaximum() and Minimum methods
        System.out.println("Last(Maximum) day in the month " + calendar.getMaximum(Calendar.DATE));
        System.out.println("Maximum day-number in a month "+calendar.getMaximum(Calendar.DAY_OF_WEEK));
        System.out.println("Minimum day-number in a month "+calendar.getMinimum(Calendar.DAY_OF_WEEK));
        //DAY_OF_WEEK with getMaximum or GetMinimum will not tell the day name of first and last Date of the month.
        //It tells the last day of the week which occurs in the month(obviously saturday i.e 7) and first day of the week which occured in the month(obviously sunday i.e 1) for any month.
        System.out.println("Last (maximum) week number in the year "+ calendar.getMaximum(Calendar.WEEK_OF_YEAR));

        //Finding future and past days information by adding or subtracting day, week, month, year etc. in given date
        calendar.add(Calendar.DATE, 27);
        System.out.println("Date after 27 days is "+ calendar.getTime());
        calendar.add(Calendar.MONTH, -2);
        System.out.println("Date before 2 months was "+calendar.getTime());
        calendar.add(Calendar.YEAR, 1);
        System.out.println("Date after 1 year will be "+ calendar.getTime());
        calendar.add(Calendar.WEEK_OF_MONTH, 2);
        System.out.println(calendar.getTime());

        calendar.set(Calendar.DAY_OF_MONTH, 22); //Set Day of the Month, 1-31
        calendar.set(Calendar.MONTH,6); //Set month, starts with JANUARY = 0 to DECEMBER = 11
        calendar.set(Calendar.YEAR,2011); //Set year
        System.out.println("Newly set time is "+calendar.getTime());

        //Formatter used to format date in particular format.
        //SimpleDateFormatter is used with Calender to format date in particular format.
        SimpleDateFormat formatter1 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String x = formatter1.format(calendar.getTime());
        System.out.println(x);
        SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy MM dd");
        String y = formatter2.format(calendar.getTime());
        System.out.println(y);


    }
}

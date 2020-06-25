package com.aman.JavaDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

//Introduced in Java 8 - LocalDate, LocalTime, LocalDateTime - Used for Local time zone
public class LatestLocalDateTime {
    public static void main(String[] args) {
        // If you need only date then LocalDate is enough.
        LocalDate date = LocalDate.now();
        System.out.println("the current date is "+ date);

        // If you need only time then LocalTime is enough.
        LocalTime time = LocalTime.now();
        System.out.println("the current time is "+ time);

        // If you need only date and time both then LocalDatTime is needed.
        // For any complex task related to date and time always use LocalDateTime
        LocalDateTime current = LocalDateTime.now();
        System.out.println("current date and time : "+ current);

        // Formatter used to format date in particular format
        // With LocalDateTime "DateTimeFormatter" is used like
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        //"HH" is used for hour's representation in 0-24 hour format.
        String formatedDateTime = current.format(formatter);
        System.out.println("Date in formatted manner "+ formatedDateTime);
        DateTimeFormatter anotherFormatter = DateTimeFormatter.ofPattern("MM/dd/yy hh:mm a");
        //"hh" is used for hour's representation in 0-12 hour format.
        //"a" is used for representation of am/pm.
        String dateInAnotherFormat = current.format(anotherFormatter);
        System.out.println("Date in another format "+ dateInAnotherFormat);


        //**************************************************************************************//

        //Fetch particular item from LocalDateTime date
        System.out.println("Hour = " + current.getHour());
        System.out.println("Minute = " + current.getMinute());
        System.out.println("Second = " + current.getSecond());
        System.out.println("Nano Second = " + current.getNano());
        System.out.println("Year = " + current.getYear());
        System.out.println("Month = " + current.getMonth());
        System.out.println("Date = " + current.getDayOfMonth());

        //Another method to find any particular item
        System.out.println("SECOND_OF_DAY = "+ current.get(ChronoField.SECOND_OF_DAY));
        System.out.println("SECOND_OF_MINUTE = "+ current.get(ChronoField.SECOND_OF_MINUTE));
        System.out.println("MINUTE_OF_DAY" + current.get(ChronoField.MINUTE_OF_DAY));
        System.out.println("MINUTE_OF_HOUR" + current.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("HOUR_OF_DAY = "+ current.get(ChronoField.HOUR_OF_DAY));
        System.out.println("HOUR_OF_AMPM = "+ current.get(ChronoField.HOUR_OF_AMPM));
        System.out.println("CLOCK_HOUR_OF_DAY = "+ current.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println("CLOCK_HOUR_OF_AMPM = "+ current.get(ChronoField.CLOCK_HOUR_OF_AMPM));
        System.out.println("DAY_OF_YEAR = "+ current.get(ChronoField.DAY_OF_YEAR));
        System.out.println("DAY_OF_MONTH = "+ current.get(ChronoField.DAY_OF_MONTH));
        System.out.println("DAY_OF_WEEK = "+ current.get(ChronoField.DAY_OF_WEEK));
        System.out.println("MONTH_OF_YEAR = "+ current.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("YEAR = "+ current.get(ChronoField.YEAR));


        //*******************************************************************************************//

        //How to set date from year, month, day_of_month, hour, minute, second, nano
        //Possible formats
        //Y, M-num, D, h, m
        LocalDateTime ldt1 = LocalDateTime.of(2016, 11, 30, 16, 25);
        System.out.println(ldt1);
        //Y, M-name, D, h, m
        LocalDateTime ldt2 = LocalDateTime.of(2010, Month.APRIL, 11, 10, 19);
        System.out.println(ldt2);
        //Above five items(Y, M, D, h, m) are necessary in order to create date.Apart from that you can optionally add seconds and nano seconds.
        LocalDateTime ldt3 = LocalDateTime.of(2017, 9, 11, 15, 11, 50);
        System.out.println(ldt3);
        LocalDateTime ldt4 = LocalDateTime.of(2019, Month.MARCH, 6, 10, 25, 23, 72522932);
        System.out.println(ldt4);


        //*********************************************************************************************//

        //Operations on LocalDateTime to get future and past dates
        //Possible operations :-
        //Plus :- plusYears(), plusMonths(), plusWeeks(), plusDays(), plusHours(), plusMinutes(), plusSeconds() and plusNanos()
        //Minus :- minusYears(), minusMonths(), minusWeeks(), minusDays(), minusHours(), minusMinutes(), minusSeconds() and minusNanos()
        ldt1.plusYears(1);
        System.out.println(ldt1);
        ldt2.minusMonths(6);
        System.out.println(ldt2);
        ldt3.plusWeeks(39);
        System.out.println(ldt3);
        ldt4.minusMinutes(96);
        System.out.println(ldt4);
    }
}

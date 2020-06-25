package com.aman.JavaDateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Set;

//The ZonedDateTime class in the Java 8 date time API represents a date and time with time zone information
public class LatestZonedTime {
    public static void main(String[] args) {
        //Basics of ZonedDateTime
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Current zone current time : "+ zonedDateTime);
        ZoneId currentZoneId = zonedDateTime.getZone();
        System.out.println("Current zone Id : "+currentZoneId);

        //Methods to get ZoneId :- Important as ZoneId is required for creating a ZoneDateTime object for a specific zone
        //Based on Zone name
        ZoneId tokyoZoneId = ZoneId.of("Asia/Tokyo");
        System.out.println("Tokyo Zone Id :- "+ tokyoZoneId);

        //Based on UTC time
        ZoneId utcZoneId = ZoneId.of("UTC+1");
        System.out.println("UTC + 1 location ZoneId :- "+ utcZoneId);

        //To get list of all available zoneIds
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println("All Available ZoneIds :- "+ allZoneIds);

        //Different ways for creating ZonedDateTime object.
        ZonedDateTime zdt1 = ZonedDateTime.of(2016, 5, 5, 5, 21, 52, 0, utcZoneId );
        System.out.println("Zoned date time :- "+ zdt1);

        LocalDateTime ldt = LocalDateTime.now();
        ZonedDateTime zdt2 = ZonedDateTime.of(ldt, tokyoZoneId);
        System.out.println("Local time is :- "+ ldt+", Tokyo time is :- "+ zdt2);

        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.of(5,30);
        ZonedDateTime zdt3 = ZonedDateTime.of(ld, lt, ZoneId.of("America/Santiago"));
        System.out.println("Santiago time is :- "+zdt3);

        //Methods of ZonedDateTime :- All methods of LocalDateTime is also applicable for ZonedDateTime
        System.out.println("Year in Santiago is :- "+zdt3.getYear());
        System.out.println("Day of Month in Santiago is :- "+zdt3.get(ChronoField.DAY_OF_MONTH));
        DateTimeFormatter simpleFormatter = DateTimeFormatter.ofPattern("MM/dd/yy hh:mm a");
        System.out.println("Santiago date in simple format :- "+simpleFormatter.format(zdt3));

        zdt3.plusYears(2);
        System.out.println("New date with extended year :- "+ zdt3);
        zdt3.minusWeeks(5);
        System.out.println("Next date with decreased weeks :- "+ zdt3);
    }
}

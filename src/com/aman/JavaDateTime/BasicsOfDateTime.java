package com.aman.JavaDateTime;

import java.util.Date;

public class BasicsOfDateTime {
    public static void main(String[] args) {
        //Constructors of Date Class
        Date d1 = new Date();
        System.out.println("Current date is " + d1);
        Date d2 = new Date(1568232236232L);
        System.out.println("Date represented is "+ d2);
        //Methods of Date Class
        //Comparison methods
        boolean isAfter = d1.after(d2);
        System.out.println("Is d1 after d2 "+isAfter);
        boolean isBefore = d1.before(d2);
        System.out.println("Is d1 before d2 "+isBefore);
        boolean isEqual = d1.equals(d2);
        System.out.println("Is d1 equal to d2 "+isEqual);
        int comp = d1.compareTo(d2);
        System.out.println("Compare d1 with d2 "+ comp);

        //Methods to fetch and set time in ms
        long t = d1.getTime();
        System.out.println("Current time in ms "+ t);
        d1.setTime(t+1000000);
        //Return type of setTime is void.So no benefit of catching the value
        System.out.println("New set time "+d1);

    }
}

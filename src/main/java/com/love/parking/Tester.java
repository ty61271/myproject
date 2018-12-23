package com.love.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
//        java8
        Instant instant=Instant.now();
        System.out.println(instant);
//        local
        LocalDateTime now=LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter=
                DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(now));
        System.out.println(now.plus(Duration.ofHours(3)));
        LocalDateTime other=
                LocalDateTime.of(2018,9,27,9,27,27);
        System.out.println(other);
//        java();
    }

    private static void java() {
        Date date=new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        SimpleDateFormat sdf=
                new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date));
        String s="2018/9/27 09:27:00";
        Date other=null;
        try {
            other = sdf.parse(s);
            System.out.println(other);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH,8);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_MONTH,4);
        System.out.println(calendar.getTime());
    }
}

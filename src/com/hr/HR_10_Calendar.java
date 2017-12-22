package com.hr;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class HR_10_Calendar {

    public static String getDay(String day, String month, String year) {
        String inputDateStr = String.format("%s/%s/%s", day, month, year);
        Date inputDate = null;
        try {
            inputDate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(inputDateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(inputDate);
        String dayOfWeek = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
        return dayOfWeek;
    }

    public static void run() {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
    }
}


package pl.sda.javastart.day2;

import java.time.LocalDateTime;
import java.time.*;

public class DateToVars {
    /*   public static String hourDate(LocalDateTime a) {

           int minute = a.getMinute();
           int hour = a.getHour();
           int day = a.getDayOfMonth();
           int month = a.getMonthValue();
           int year = a.getYear();

           return hour + ":" + minute + " " + day + "." + month + "." + year;
       }

       public static void main(String[] args) {
           LocalDateTime a = LocalDateTime.now();
           System.out.println(hourDate(a));
       }*/
    public static void main(String[] args) {
        LocalDateTime a = LocalDateTime.now();
        int minute = a.getMinute();
        int hour = a.getHour();
        int day = a.getDayOfMonth();
        int month = a.getMonthValue();
        int year = a.getYear();
        int fromMidnite = hour*60+minute;
        int fullDay = 24*60;
        int diff = fromMidnite*100 / fullDay;
        System.out.println(hour + ":" + minute + " " + day + "." + month + "." + year+"; ile % doby minęło: "+diff);



    }
}

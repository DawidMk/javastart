package pl.sda.javastart.day2;

import java.util.Date;

public class Methods {

    public static double rectArea(double a, double b) {
        return a * b;
    }

    public static double obwod(double a, double b) {
        return 2 * (a + b);
    }

    public static double inchToMeter(double a) {
        return a * 0.0254;

    }

    public static String minutesToDate(int time) { // todo
//        int years = time / 525600;
//        int days = time / 1440;
//        int hours = time / 60;
//        int minutes = time % 60;
        int years = time / 525600; // days*365 fixme
        int days = years / 1440; // 24*60 fixme
        int hours = days / 24;
        int minutes = time % 60;
        return years + "y " + days + "d " + hours + "h " + minutes + "m";


    }

    public static int sum3DigitsOfNumbers(int number) {

        int first = number % 1000 / 100;
        int mid = number % 100 / 10;
        int last = number % 10;

        return first + mid + last;

    }

    public static double bmi(double weight, double height) {
        return weight / Math.pow(height, 2);


    }


    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int minutes = 525600;

        System.out.println(rectArea(a, b));
        System.out.println(60 * 24 * 365);

        System.out.println(minutesToDate(minutes));

        System.out.println(sum3DigitsOfNumbers(234));

        double w = 80;
        double h = 1.85;
        System.out.println(bmi(w, h));



    }



    }


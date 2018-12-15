package pl.sda.javastart.day2;

import java.math.BigDecimal;

public class VariousMethods {
    public static double stringToDouble(String a) {
//        return Double.parseDouble(a);
        return Double.valueOf(a);
    }

    public static boolean isStringEmptyOrNull(String a) {
        return a == null || a.isEmpty();
    }

    public static BigDecimal stringToBigDecimal(String a) {
        return new BigDecimal(a);
    }

    public static double fahrenheitToCelsius(double a) {
        return (a - 32) / 1.8;
    }

    public static String kphToMph(double kph) {
        return kph * 0.62137 + " mph";
    }

    public static String kmhToMs(double kph) {
        return kph * (1000d / 3600d) + " m/s";
    }

    public static int minsToQuaters(int mins) {
        return mins / 15;
    }


    public static void main(String[] args) {
        String a = "tru";
        String b = "123456789987654320001000.0012654";
        System.out.println(stringToDouble("123"));
        System.out.println(isStringEmptyOrNull(a));
        System.out.println(stringToBigDecimal(b));
        System.out.println(fahrenheitToCelsius(212));
        System.out.println(kphToMph(125));
        System.out.println(kmhToMs(100));
        System.out.println(minsToQuaters(124));
    }
}

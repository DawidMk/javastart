package pl.sda.javastart.day1;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerBigDecimal {
    public static void main(String[] args) {
        float u = 0.03f;
        double x = 0.03;
        double y = 0.02;
        double z = x - y;
        System.out.println(z);

        BigDecimal a = new BigDecimal("0.02");
        BigDecimal b = new BigDecimal("0.03");
        System.out.println(b.subtract(a));

        BigDecimal c = BigDecimal.valueOf(x);
        BigDecimal d = BigDecimal.valueOf(y);
        System.out.println(c.subtract(d));
        System.out.println(c);
        System.out.print("float ");
        System.out.println(BigDecimal.valueOf(u));

    }

}

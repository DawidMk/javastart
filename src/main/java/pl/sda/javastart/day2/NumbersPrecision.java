package pl.sda.javastart.day2;

import java.text.DecimalFormat;

public class NumbersPrecision {
    public static void main(String[] args) {
        int x = 100;
        double pi = Math.PI;
        double pi2 = 3.146;
        float n = 5.2f;
        float m = 2324435.25f;
//        DecimalFormat df = new DecimalFormat("#.00");
//        System.out.println(df.format(pi));
        System.out.printf("simple integer: %d%n",x);
        System.out.printf("the val is : %010.2f%n",pi);
        System.out.printf("specific width: %.4f%n",n);
        System.out.printf("right margin: %.4f%n",m);

    }
}

package pl.sda.javastart.day3;

public class Fibonacci {
    public static void main(String[] args) {
//        fibonacci(8);
        int n = 6;
        for(int i = 0; i<6;i++) {
            System.out.println(fibonacciRe(i));
        }
    }

    private static void fibonacci(int i) {
        int f0 = 0;
        int f1 = 1;


        int counter = 1;
        System.out.println(f0);
        System.out.println(f1);
        while (counter < i) {
            int sum = f0 + f1;
            System.out.println(sum);
            f0 = f1;
            f1 = sum;


            counter++;
        }
    }

     /*   for (int j = 0; j <= i; j++) {

            f3 = f0+f1;
            System.out.println(f3);
            f0++;
            f1++;

        }*/

    public static int fibonacciRe(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRe(n - 1) + fibonacciRe(n - 2);
        }

    }


}





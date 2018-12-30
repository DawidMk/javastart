package pl.sda.javastart.day4.homework;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.Scanner;

public class Homework2 {
    private static boolean areBothEven(int a, int b) {
        return (a % 2 == 0 && b % 2 == 0);
    }

    private static boolean isSum(int a, int b, int c) {
        return a + b == c;
    }

    private static boolean isSumSecond(int a, int b, int c) {
        return a + b == c || b + c == a || a + c == b;
    }

    private static boolean isBiggerThanZero(int a, int b) {
        return a > 0 || b > 0;
    }

    private static boolean isAnyLessThanZero(int... args) {
        for (int i : args) {
            if (i < 0) {
                return true;
            }
        }
        return false;
    }

    private static String speeding(String mood, int speed) {
        if (speed > 50) {
            if (mood.equals("Dobry")) {
                speed = speed - 5;
                return speedingTicket(speed);
            } else {
                return speedingTicket(speed);
            }
        } else {
            return "alles gut";
        }
    }

    private static String speedingTicket(int speed) {


        if (speed <= 50) {
            return "alles gut";
        } else if (speed <= 60) {
            return "fee is 100 zł";
        } else if (speed <= 70) {
            return "fee is 200 zł";
        } else if (speed <= 90) {
            return "fee is 300 zł";
        } else {
            return "zabrali prawko";
        }

    }

    private static void calcIf() {
        Scanner scanner = new Scanner(System.in);
        String next;
        do {

            System.out.println("podaj 1szą liczbę");
            double a = scanner.nextDouble();
            System.out.println("podaj 2gą liczbę");
            double b = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("podaj działanie: +, -, /, *");
            String operation = scanner.nextLine();

            if (operation.equals("+")) {
                System.out.println("wynik = " + (a + b));
            } else if (operation.equals("-")) {
                System.out.println("wynik = " + (a - b));
            } else if (operation.equals("*")) {
                System.out.println("wynik = " + (a * b));
            } else if (operation.equals("/")) {
                System.out.println("wynik = " + (a / b));
            } else {
                System.out.println("nieprawidłowe działanie");
            }
            System.out.println("dalej? tak/nie");
            next = scanner.nextLine();

        } while (next.equals("tak"));
    }

    //---------------------------------------------------------------------------------------------------------------
    private static void multipTab(int param) {
        if (param > 0 && param <= 10) {
            for (int i = 1; i <= param; i++) {
                System.out.print("\t" + i);
            }
            System.out.println();
            for (int i = 0; i <= param; i++) {
                System.out.print("----");
            }
            System.out.println();
            for (int i = 1; i <= param; i++) {
                System.out.print(i + "|\t");
                for (int j = 1; j <= param; j++) {
                    System.out.print(i * j + "\t");

                }
                System.out.println();
            }
        } else {
            System.out.println("nieprawidłowa liczba wejściowa");
        }
    }
    //------------------------------------------------------------------------------------

    private static void powersToTheLimit(double a, double b) {
        double powah = 0;
        double result = 0;
        double counter = 0;

        while (result < b) {
            powah++;
            result = Math.pow(a, powah);
            System.out.println(result);
            result += result;

        }
    }

    //------------------------------------37--------------------------------------------
    private static int sumOfArray(int[] tab) {
        int sum = 0;
        Arrays.sort(tab);
        for (int i = 0; i < tab.length-1; i++) {
            sum = sum + tab[i];
        }
        return sum;
    }

    private static int sumOfArray2(int[] tab) {
        int sum = 0;
        int max = tab[0];
        for (int i = 0; i < tab.length - 1; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != max) {
                sum = sum + tab[i];

            }
        }
        return sum;
    }

    //-----------------------------------38-----------------------------------------
    private static void square(int a, int b) {
        for (int i = 0; i < a; i++) {
            System.out.print("X");
            for (int j = 0; j < b; j++) {
                if (i == 0 || i == a - 1) {
                    System.out.print("X");
                } else {
                    System.out.print(".");
                }
            }
            System.out.print("X");
            System.out.println();

        }
    }

    public static void main(String[] args) {

//        System.out.println(areBothEven(2, 5));
//        System.out.println(isSum(1, 2, 3));
//        System.out.println(isSumSecond(3, 2, 1));
//        System.out.println(isBiggerThanZero(1, -8));
//        System.out.println(isAnyLessThanZero(1, 2, 3, 1, -4));
//        System.out.println(speeding("Dobry", 51));
//calcIf();
//        multipTab(-10);
//        powersToTheLimit(3, 83);
        int[] tab = {1, 4, 5, 2, 3};
        System.out.println(1 + 2 + 3 + 4 + 5);
        System.out.println(sumOfArray2(tab));
        System.out.println(sumOfArray(tab));
//        square(3, 9);

    }

}

package pl.sda.javastart.day2;

import java.util.Scanner;

public class TestResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("podaj ile punktów zdobyto: ");
        int result = scanner.nextInt();
//        testResult(result);
        System.out.println(testResult2(result));
//        int a = 6-((100-result)/10);
//        System.out.println(a);
    }

    public static void testResult(int points) {
        if (points >= 50) {
            if (points < 60) {
                System.out.println("zdano na 2");
            } else if (points < 70) {
                System.out.println("zdany na 3");
            } else if (points < 80) {
                System.out.println("zdany na 4");
            } else if (points < 90) {
                System.out.println("zdany na 5");
            } else if (points <= 100) {
                System.out.println("zdany na 6");
            } else {
                System.out.println("wynik poza skalą");
            }

        } else {
            System.out.println("niezdany");
        }
    }



    public static String passedPoints(int points) {
        if (points < 60) {
            return ("zdano na 2");
        } else if (points < 70) {
            return ("zdany na 3");
        } else if (points < 80) {
            return ("zdany na 4");
        } else if (points < 90) {
            return ("zdany na 5");
        } else if (points <= 100) {
            return ("zdany na 6");
        } else {
            return ("wynik poza skalą");
        }

    }

    public static String passedPoints2(int points){
        if (points <= 100) {
            return Integer.toString(6 - ((100 - points) / 10));
        }
        else{
            return "wynik poza skalą";
        }
    }

    public static String testResult2(int points) {
        if (points >= 50) {
            return passedPoints2(points);


        } else {
            return ("niezdany");
        }
    }

}

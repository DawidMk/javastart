package pl.sda.javastart.day4.homework;

import java.util.*;
import javax.lang.model.type.ArrayType;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Homework1 {
    private static int[] reverseArray(int[] tab) {
        int[] result = new int[tab.length];

        for (int i = 0; i < tab.length; i++) {
            result[tab.length - 1 - i] = tab[i];

        }
        return result;
    }

    private static int[] minMax(int[] tab) {
        int min = tab[0];
        int max = tab[0];

        for (int i = 0; i < tab.length; i++) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        int[] result = {min, max};
        return result;
    }

    private static void calcOnNumbers() {
        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("podaj liczbę");
            int input = scanner.nextInt();
            tab[i] = input;
            sum = sum + i;
        }
        int[] minimaxi = minMax(tab);
        int min = minimaxi[0];
        int max = minimaxi[1];
        double avg = sum / tab.length;
        System.out.println("suma: " + sum);
        System.out.println("średnia: " + avg);
        System.out.println("max: " + max);
        System.out.println("min: " + min);

    }

    private static void inputNums(int a) {
        for (int i = 1; i <= a; i++) {
            for (int k = a; k > i; k--) {
                System.out.print(".");
            }/*
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }*/
            System.out.println();
        }
    }

    private static void calulationsONNumbers() {
        int[] tab = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("podaj liczbę: ");
            int input = scanner.nextInt();

            if (i > 0 && IntStream.of(tab).anyMatch(x -> x == input)) {
                System.out.println("było!");
                i--;
                continue;
            }

            tab[i] = input;
            sum = sum + input;
        }
        double avg = sum / 5;
        int[] miniMax = minMax(tab);
        int min = miniMax[0];
        int max = miniMax[1];

        System.out.println(Arrays.toString(tab));
        System.out.println(sum);
        System.out.println(avg);
        System.out.println("min - " + min);
        System.out.println("max - " + max);
    }

    private static int[] minMax2(int[] tab) {

        int max = tab[0];
        int min = tab[0];
        for (int x : tab) {
            if (x > max) {
                max = x;
            }
            if (x < min) {
                min = x;
            }
        }
        int[] result = {min, max};
        return result;

    }


//------------------------------------------------------------next one----------------------------------------------------------------------//

    private static void isEvenWhile() {
        int start = 1;
        while (start <= 20) {
            if (start % 2 == 0) {
                System.out.println(start + " jest parzysta");
            } else {
                System.out.println(start + " jest nieparzysta");
            }
            start++;
        }
    }

    private static void isEvenDoWhile() {
        int start = 1;
        do {
            if (start % 2 == 0) {
                System.out.println(start + " jest parzysta");
            } else {
                System.out.println(start + " jest nieparzysta");
            }
            start++;
        } while (start <= 20);
    }

    private static void isEvenFor() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " jest parzysta");
            } else {
                System.out.println(i + " jest nieparzysta");
            }
        }
    }

    //-----------------------------------------------------------------------------------------------------------------------------------
    private static int sumFromRange(int[] tab, int a, int b) {
        int[] result = {tab[a], tab[b]};
        int sum = 0;
        for (int x : result) {
            sum = sum + x;
        }
        return sum;
    }

    //---------------------------------------------------------------------------------------------------------------------------------

    private static void powsToNumber(double a, double b) {

        for (int i = 0; i < b; i++) {
            System.out.println(a + " do potęgi " + i + " to " + Math.pow(a, i));
        }
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------

    private static void xmasTree(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

    private static void xmasTreeSameNumberPerRow(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    //----------------------------------------------------------------------------------------------------------------------------------------------------------------
    private static void fibonacciWhile(int a) {
        int first = 0;
        int second = 1;
        int nextOne;
        System.out.print(first + " ");
        System.out.print(second + " ");
        int counter = 0;
        while (counter < a) {
            nextOne = first + second;
            System.out.print(nextOne + " ");
            first = second;
            second = nextOne;
            counter++;
        }
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    private static void nonDividableByThree() {
        int i = 1;
        while (i < 20) {
            if (i % 3 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    private static void silnia(int n) {
        int iloczyn = 1;
        int c = 1;

        while (c <= n) {
            iloczyn = iloczyn * c;
            System.out.print(c + " ");
            System.out.println(iloczyn);

            c++;
        }
    }

    private static void calculator() {
        Scanner scanner = new Scanner(System.in);

        String calc;
        double a;
        double b;
        double result;
        do {
//        while(!calc.equals("koniec")){
            System.out.println("lets'a go!(dostępne działania +,-: ");
            a = scanner.nextDouble();
            scanner.nextLine();
//            System.out.println("podaj działanie: + , - ");
            calc = scanner.nextLine();
//            System.out.println(" podaj b: ");
            b = scanner.nextDouble();
            scanner.nextLine();


            if (calc.equals("+")) {

                /*System.out.println("podaj a: ");
                a = scanner.nextDouble();
                System.out.println(" podaj b: ");
                b = scanner.nextDouble();*/
                result = a + b;
                System.out.println(result);

            } else if (calc.equals("-")) {

               /* System.out.println("podaj a: ");
                a = scanner.nextDouble();
                System.out.println(" podaj b: ");
                b = scanner.nextDouble();*/
                result = a - b;
                System.out.println(result);
            }
            System.out.println("Dalej? (koniec)");
            calc = scanner.nextLine();

        }


        while (!calc.equals("koniec"));
    }

    //-----------------------------------------------------------------------------------------------------------------------------------------
    private static void switchWelcome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("wybierz język: PL, EN, DE, FR: ");
        String language = scanner.nextLine();

        switch (language) {
            case "PL":
                System.out.println("witojcie!");
                break;
            case "EN":
                System.out.println("hello!");
                break;
            case "DE":
                System.out.println("wilkommen!");
                break;
            case "FR":
                System.out.println("bonżur!");
                break;
            default:
                System.out.println("nieprawidłowa opcja; inicjalizacja: ang");
                System.out.println("hello!");
        }


    }

    //----------------------------------------------------------------------------------------------------------------------
    private static void xmasTree2() {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i; j++)
                System.out.print(".");
//            for (int k = 0; k < (2 * i + 1); k++)
//                System.out.print("*");
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int m = i; m >= i; m--) {
                System.out.print(m);
                for (int l = 0; l < 10 - i; l++)
                    System.out.print(".");
                System.out.println();
            }
        }
    }

    //------------------26---------------------------------------------------------------
    public static int[] concatenateArrays(int[] firstTab, int[] secondTab) {
//        int[] result = new int[firstTab.length];
        int lent = firstTab.length + secondTab.length;
        int[] result = Arrays.copyOf(firstTab, lent);
        for (int i = 0; i < secondTab.length; i++) {
            result[firstTab.length + i] = secondTab[i];
        }
        return result;

    }

    public static int[] concatenateAndSortArray(int[] firstTab, int[] secondTab) {
//        Arrays.sort(firstTab);
//        Arrays.sort(secondTab);
        int lent = firstTab.length + secondTab.length;
        int[] result = Arrays.copyOf(firstTab, lent);
        for (int i = 0; i < secondTab.length; i++) {
            result[firstTab.length + i] = secondTab[i];
        }
        Arrays.sort(result);
        return result;

    }

    public static void removeDuplicates(int[] first, int[] second) {
        int[] sum = concatenateArrays(first, second);
        Arrays.sort(sum);
        int[] result = {sum[0]};
//        String output = "";


        for (int i = 0; i < sum.length; i++) {
            if (i == 0) {
                continue;
//                output = output+sum[i];
            }

                if (sum[i] != sum[i - 1]) {
                    result = Arrays.copyOf(result,result.length+1);
                    result[i] = sum[i];
                }
                else{
                    result = Arrays.copyOf(result,result.length+1);

            }
        }

        System.out.println(Arrays.toString(result));

    }
//    IntStream.of(tab).anyMatch(x -> x == input))

    public static void main(String[] args) {
//        inputNums(4);
//        calulationsONNumbers();
//        isEvenFor();
//            int[] tab = {1, 2, 3, 4, 5, 6};
//            System.out.println(sumFromRange(new int[]{1, 2, 3, 4, 5, 6}, 3, 5));
//        powsToNumber(2, 4);
//        xmasTree(5);
//        xmasTreeSameNumberPerRow(5);
//        fibonacciWhile(10);
//        nonDividableByThree();
//        silnia(12);
//        calculator();
//        xmasTree2();

       /* for (int j = 1; j <= 10; j++) {
            for(int i = 10-j; i >= 0; i--){
                System.out.print(".");
            }
            for (int i = 1; i < j; i++) {
                System.out.print(i);
            }
            for (int i = j; i >= 1; i--) {
                System.out.print(i);
            }
            for(int i = 10-j; i >= 0; i--){
                System.out.print(".");
            }
            System.out.println();}*/
        int[] tab1 = {4, 2, 2, 3};
        int[] tab2 = {4, 5, 6};
        System.out.println(Arrays.toString(concatenateArrays(tab1, tab2)));
//        System.out.println(Arrays.toString(concatenateAndSortArray(tab1,tab2)));
        removeDuplicates(tab1, tab2);
    }

}


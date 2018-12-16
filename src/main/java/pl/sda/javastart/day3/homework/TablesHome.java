package pl.sda.javastart.day3.homework;

import java.util.Arrays;
import java.util.Scanner;

public class TablesHome {
    public static int[] reverseArray(int[] tab) {
        int[] table = new int[tab.length];

        for (int i = 0; i < tab.length; i++) {
            table[i] = tab[tab.length - 1 - i];
        }
        return table;

    }

    public static int[] reverseArray2(int[] tab) {
        int[] table = new int[tab.length];

        for (int i = tab.length; i > 0; i--) {
            table[tab.length - i] = tab[i - 1];
        }
        return table;

    }

    public static int[] minMax(int[] tab) {

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
        int[] tabResult = new int[]{min, max};
        return tabResult;
    }

    public static void calcOnNumbers1() {
        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("podaj liczbę ");
            int a = scanner.nextInt();
            tab[i] = a;
            if (i > 0 && a == tab[i - 1]) {
                System.out.println("było");
                return;
            }
        }
        int sum = 0;
        int max = minMax(tab)[1];
        int min = minMax(tab)[0];
        for (int x : tab) {
            sum = sum + x;
        }


        int avg = sum / tab.length;
        System.out.println("suma " + sum);
        System.out.println("średnia to " + avg);
        System.out.println("max to " + max);
        System.out.println("min to " + min);
    }


    public static void calcOnNumbers4() {
        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("podaj liczbę ");
            int a = scanner.nextInt();
            if (i > 0 && a == tab[i - 1]) {
                System.out.println("było");
                i--;
                continue;

            }
            tab[i] = a;
        }
        int sum = 0;
        int max = minMax(tab)[1];
        int min = minMax(tab)[0];
        for (int x : tab) {
            sum = sum + x;
        }


        int avg = sum / tab.length;
        System.out.println("suma " + sum);
        System.out.println("średnia to " + avg);
        System.out.println("max to " + max);
        System.out.println("min to " + min);

    }


    public static void main(String[] args) {
//        int[] inputArray = {1, 2, 3, 4};
//        System.out.println(Arrays.toString(reverseArray(inputArray)));
//        for (int i : inputArray) {
//            System.out.println(i);
        calcOnNumbers4();
    }

}



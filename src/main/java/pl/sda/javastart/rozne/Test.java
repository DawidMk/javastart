package pl.sda.javastart.rozne;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        String[] tab = new String[5];
//        nameList(tab);
        nElements(5);


    }

    public static void nameList(String[] tab) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= 4; i++) {
            System.out.print("podaj imię ");
            tab[i] = scanner.nextLine();
        }
        for (int i = 0; i <= 4; i++) {
            System.out.println("imię to " + tab[i]);
        }
    }

    public static void nElements(int n) {
        int tablica[] = new int[n];
        int i = 0;
        while (i < n) {
            tablica[i] = i;
            i++;
        }
        for (int j = 0; j < n; j++) {
            System.out.println("wynik to " + tablica[j]);
        }
    }


}
/*
    public static String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1, str.length());

    }

    public static String frontBack(String str) {
        if (str.length() > 1) {
            return str.substring(str.length() - 1) + str.substring(1, str.length() - 1) + str.substring(0, 1);
        }
        return str;
    }
    public static String front3(String str){
        if (str.length()>=3){
            return str.substring(0,3)+str.substring(0,3)+str.substring(0,3);
        }
        return str+str+str;
    }
    public static boolean or35(int n) {
        if(n%3=0 || n%5==0){
            return true;
        }
    }*/



package pl.sda.javastart.day3;

import sun.nio.cs.ArrayDecoder;

import java.util.*;

public class Tables {
    public static void main(String[] args) {
       /* int[][] tab = new int[3][];
        tab[0] = new int[3];
        tab[1] = new int[2];
        tab[2] = new int[1];
        int n = 9;
        int[] tabThird = new int[n];


        int[] tabSecond = {1, 2, 3};

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j]);
            }
            System.out.println();

        }

        int[] emptyTab = new int[9];
        for (int i = 0; i < emptyTab.length; i++) {
            emptyTab[i] = i + 1;
        }
        printTable(emptyTab);*/
        int[] tabFirst = {1, 2, 3};
        int[] tabSecond = {4, 5, 6};

//        int[] tabThird = (int[]) ArrayUtils.addAll(tabFirst, tabSecond);


        int[] emptyTab = new int[9];
        for (int i = 0; i < emptyTab.length; i++) {
            emptyTab[i] = i + 1;
        }
//        System.out.println(printTable(emptyTab));
//        System.out.println(Arrays.toString(emptyTab));
//        System.out.println(Arrays.toString(createArray(9)));
        int[] tabb = {-6,-5,2};

        System.out.println(calcDiff(tabb));
    }


    public static String printTable(int[] tab) {
//        System.out.print("\"[");
//        for (int i = 0; i < tab.length-1; i++) {
//            System.out.print(tab[i] + ", ");
//        }
//        System.out.println(tab[tab.length-1]+"]\"");
//        String result = "[";
//        for (int i = 0; i < tab.length - 1; i++) {
//            result = result + tab[i] + ", ";
//        }
//        result = result + tab[tab.length - 1] + "]";
//        return result;


        String result = "[";
        for (int i = 0; i < tab.length; i++) {
            if (i < tab.length - 1) {
                result = result + tab[i] + ", ";
            } else {
                result = result + tab[i];
            }
        }
        result = result + "]";
        return result;

    }

    public static int[] createArray(int a) {
        int[] tab = new int[a];


        for (int i = 0; i < a; i++) {
            tab[i] = i;
        }
        return tab;
    }

    public static int calcDiff(int[] tab) {
        int tabMax = tab[0];
        int tabMin = tab[0];
        for(int i : tab){
            if(i>tabMax){
                tabMax = i;
            }

        }
        for (int j : tab){
            if (j<tabMin){
                tabMin = j;
            }
        }
        int result = tabMax-tabMin;
        return Math.abs(result);

    }


}



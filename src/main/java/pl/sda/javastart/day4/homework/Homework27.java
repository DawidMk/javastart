package pl.sda.javastart.day4.homework;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Homework27 {

    public static int[] concatenateArrays(int[] firstTab, int[] secondTab) {
        int lent = firstTab.length + secondTab.length;
        int[] result = Arrays.copyOf(firstTab, lent);
        for (int i = 0; i < secondTab.length; i++) {
            result[firstTab.length + i] = secondTab[i];
        }
        return result;

    }

    public static int[] concatenateAndSortArray(int[] firstTab, int[] secondTab) {
        int arraysSum = firstTab.length + secondTab.length;
        int[] sum = Arrays.copyOf(firstTab, arraysSum);
        for (int i = 0; i < secondTab.length; i++) {
            sum[firstTab.length + i] = secondTab[i];
        }
        Arrays.sort(sum);
        int[] result = removeDupesLoopInLoop(sum);
        return result;

    }

    public static int[] removeDuplicates(int[] tab) {
        String output = tab[0] + ",";

        for (int i = 0; i < tab.length; i++) {
            if (i == 0) {
                continue;
            }
            if (tab[i] != tab[i - 1]) {
                output = output + tab[i] + ",";
            }
        }
        String[] items = output.split(",");
        int[] result = new int[items.length];
        for (int i = 0; i < items.length; i++) {
            result[i] = Integer.parseInt(items[i]);

        }
        return result;

    }
    /*
       public static void removeDuplicates(int[] first, int[] second) {
        int[] sum = concatenateArrays(first, second);
        Arrays.sort(sum);
        int[] result = {sum[0]};



        for (int i = 0; i < sum.length; i++) {
            if (i == 0) {
                continue;
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
     */

    private static int[] removeDupesLoopInLoop(int[] tab) {

        int[] temp = new int[]{tab[0]};
        for (int i : temp) {
            for (int j : tab) {
                if (j != i) {
                    temp = Arrays.copyOf(temp, temp.length + 1);
                    temp[i + 1] = j;
                    i++;
                }
            }
        }
        return temp;
    }

    //    IntStream.of(tab).anyMatch(x -> x == input))
 /*   private static void removeDupesStream(int[] tab) {
        int[] temp = new int[]{tab[0]};
        for(int i : temp){
            for(int j : tab){
                if(IntStream.of(temp).anyMatch(x -> x != j)){
                    temp = Arrays.copyOf(temp, temp.length + 1);
                    temp[i]=j;
                    i;

                }
            }
        System.out.println(Arrays.toString(temp));
        }}*/




    public static void main(String[] args) {
        int[] tabFirst = {1, 0, 3, 4, 6, 2, 1};
        int[] tabSec = {5, 6, 9, 7, 0, 20, 3};
        int[] tabThird = concatenateAndSortArray(tabFirst, tabSec);
        int[] tabFourth = concatenateArrays(tabFirst, tabSec);
        Arrays.sort(tabFourth);
//        System.out.println(Arrays.toString(concatenateAndSortArray(tabFirst, tabSec)));
//        System.out.println(Arrays.toString(removeDuplicates(tabThird)));
        removeDupesStream(tabFourth);


    }
}

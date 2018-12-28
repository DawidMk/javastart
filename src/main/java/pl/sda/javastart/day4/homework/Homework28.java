package pl.sda.javastart.day4.homework;

import java.util.Arrays;

public class Homework28 {
    public static int[] appendArray(int[] tab, int input) {
        int[] result = Arrays.copyOf(tab, tab.length + 1);
        result[result.length - 1] = input;
        return result;
    }

    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4};
        int n = 6;
        System.out.println(Arrays.toString(appendArray(tab, n)));
    }
}

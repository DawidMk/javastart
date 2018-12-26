package pl.sda.javastart.day4;

import java.util.Arrays;
import java.util.Random;

public class RandomGen {

    public static int[] createRandomArray(int howLong) {
        int[] tab = new int[howLong];

        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt();
        }
        return tab;
    }
    protected static int a(int a){
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(createRandomArray(5)));

    }
}

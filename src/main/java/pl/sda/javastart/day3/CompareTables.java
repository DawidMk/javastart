package pl.sda.javastart.day3;

public class CompareTables {
    public static boolean compareIfArraysAreSame(int[] tabFirst, int[] tabSecond) {
        if (tabFirst.length != tabSecond.length) {
            return false;
        }
        for (int i = 0; i < tabFirst.length; i++) {
            if (tabFirst[i] != tabSecond[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] tabFirst = {1, 2, 3};
        int[] tabSec = {1, 2, 3};
        int[] tabThird = {1, 2, 3, 4};
        int[] tabFourth = {4, 5, 6};

        System.out.println(compareIfArraysAreSame(tabFirst, tabSec));
    }
}

package pl.sda.javastart.day3.homework;

public class Choinka {
    public static void treePrintNums(int a) {//TODO przechylić w drugą stronę
        for (int i = 0; i < a; i++) {
//j <height -1 sout " "
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        treePrintNums(3);

    }
}

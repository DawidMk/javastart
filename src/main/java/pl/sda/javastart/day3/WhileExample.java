package pl.sda.javastart.day3;

public class WhileExample {
    public static void countdownFor(int entryNumber) {
        System.out.println("for");


        for (int i = entryNumber; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("bum");


    }

    public static void countdownWhile(int start) {
        System.out.println("while");
        while (start > 0) {
            System.out.println(start);
            start = start - 1;
        }
        System.out.println("bum");
    }

    public static void countdownDoWhile(int start) {
        System.out.println("do while");
        do {
            System.out.println(start);
            start = start - 1;
        } while (start > 0);
        System.out.println("bum");
    }

    public static void main(String[] args) {

//        countdownFor(11);
//
//
//        countdownWhile(11);

        countdownDoWhile(-10);
    }
}

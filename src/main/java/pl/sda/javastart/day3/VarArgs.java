package pl.sda.javastart.day3;

public class VarArgs {

    public static void varArgs(int a, int... args) {
        int counter = 0;
        System.out.println(a);
        while (counter < args.length) {
            System.out.println(args[counter]);
            counter++;
        }
    }
    public static void varArgs2(int a, int... args) {
        int counter = 0;
        int sum = a;
        while (counter < args.length) {
            sum = sum+(args[counter]);
            counter++;
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        varArgs2(1, 2,3,4,5);
    }
}

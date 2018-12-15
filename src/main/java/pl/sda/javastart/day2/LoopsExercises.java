package pl.sda.javastart.day2;

public class LoopsExercises {
    public static void printCubesOfNumbers(double a) {
//        String outcome;

        for (double i = 0; i <= a; i++) {
//            outcome = "numbers is: " + i + " cube is: " + Math.pow(i, 3)+"\n"); /TODO wyszukać czy da się przypisywać w pętli
            System.out.print("numbers is: " + i + " cube is: " + Math.pow(i, 3) + "\n");

        }
//        return "numbers is: " + i + " cube is: " + cube;
//        return outcome;
    }

    public static void countdown(int start) {
        while (start > 0) {
            System.out.println(start);
            start--;

        }
    }
    public static void printMultiplications(int a){
        int i = 0;
        while (i<=a){
            System.out.println(i*a);
            i++;
        }
    }

    public static void main(String[] args) {
//       printCubesOfNumbers(3);
//        countdown(10);
        printMultiplications(5);

    }
}

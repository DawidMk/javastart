package pl.sda.javastart.day2;

import java.util.Scanner;

public class Conversation {

    /*public static String howDoYouFeel(String a) {
        return "Cieszę się, że czujesz się " + a;
    }

    public static void greet() {
        System.out.print("Cześć, jak się czujesz? ");
    }

    public static void main(String[] args) {
        greet();
        Scanner intake = new Scanner(System.in);
        String response = intake.nextLine();
        System.out.println(howDoYouFeel(response));*/
    public static void main(String[] args) {
        Scanner intake = new Scanner(System.in);

        System.out.print("Cześć. Jak się czujesz? ");
        String feels = intake.nextLine();
        System.out.println("Cieszę się, że czujesz się " + feels);


        System.out.print("Jak masz na imię? ");
        String imie = intake.nextLine();

        System.out.print("Ile masz lat? ");
        int wiek = intake.nextInt();

        System.out.println(imie + ", masz " + wiek + " lat");

        System.out.print("Ile dokładnie masz wzrostu? ");
        int wzrost = intake.nextInt();
        System.out.println(imie + ", masz " + wzrost + " cm");

        System.out.print("how long? ");
        int longinus = intake.nextInt();
        intake.nextLine();
        System.out.println(longinus + " inches fully erect");

        System.out.print("A jak się czujesz teraz? ");
        feels = intake.nextLine();
        System.out.println("Cieszę się, że czujesz się " + feels);


    }
}


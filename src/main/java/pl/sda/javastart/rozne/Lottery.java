package pl.sda.javastart.rozne;

import java.util.Random;
import java.util.Arrays;

public class Lottery {
  public static void main(String[] args) {
        Random random = new Random();
        int[] tab = new int[100];
        int theTicket = random.nextInt(10);
        int otherTickets;
        int counter;
        System.out.print("numer losu: ");
        System.out.println(theTicket);
        int countTicket = 0;
        int countOther = 0;
        int win = 0;
        int lose = 0;
        for (int i = 0; i < tab.length; i++) {
            counter = random.nextInt(2);
            int slots = 0;

            if (counter == 0) {

                        otherTickets = random.nextInt(100);
                        if (otherTickets == theTicket) {
                            i--;
                            continue;
                        }
                        tab[i] = otherTickets;
                        countOther++;


                    }


            if (counter == 1) {
                tab[i] = theTicket;
                countTicket=countTicket+1;

            }
//            System.out.println(i + ". " + tab[i]);

        }
//        System.out.println(tab.length / 2);

        for(int i = 0; i<=10; i++){
            Random los = new Random();
            int losik = los.nextInt(tab.length);
            if(tab[losik] == theTicket){
                countTicket++;
                win++;
            }
            else{
                countOther=countOther+1;
                lose++;
            }
            System.out.println(tab[losik]);
        }
      System.out.println("ile wpadło jedynek "+countTicket);
      System.out.println("ile wpadło innych "+countOther);
      System.out.println("Jeden " + win);
      System.out.println("Reszta " + lose);

    }
    /*public static void main(String[] args) {
        Random random = new Random();
        int[] tab = new int[100];
        int theTicket = random.nextInt(100);
        int otherTickets;
        int counter;
        System.out.print("numer losu: ");
        System.out.println(theTicket);
        int countTicket = 0;
        int countOther = 0;
        for (int i = 0; i < tab.length; i++) {
//            counter = random.nextInt(2);
            int slots = 0;

            while (slots < tab.length / 2) {

                otherTickets = random.nextInt(100);
                if (otherTickets == theTicket) {
                    i--;
                    continue;
                }
                tab[i+slots] = otherTickets;
                countOther = countOther + 1;
                slots++;

            }


            tab[i] = theTicket;
            countTicket = countTicket + 1;

            System.out.println(i + ". " + tab[i]);

        }
        System.out.println(tab.length / 2);
        System.out.println("Jeden " + countTicket);
        System.out.println("Reszta " + countOther);
    }*/


   /* public static void main(String[] args) {
        int[] tab = new int[10];



//        System.out.println(Arrays.toString(tab));
    }*/
}

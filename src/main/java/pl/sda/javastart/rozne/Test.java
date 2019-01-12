package pl.sda.javastart.rozne;

import com.sun.deploy.util.ArrayUtil;

import java.text.DecimalFormat;
import java.util.*;

public class Test {
    public static void main(String[] args) {


    }
  /*  public String withoutX2(String str) {
        char tab[] = str.toCharArray();
    }*/



    public static void circumference(double rodHeight, double shadowLength, double distanceToWell) {

        double a = shadowLength / rodHeight;
        double angle = Math.atan(a);
        double b = a / 360;
        double out = 2 * Math.PI * distanceToWell / angle;
        //Your code goes here

        System.out.println(a);
        System.out.println(b);
        System.out.println(out);
    }


    private static String printer(String str) {
        System.out.println(str);
        return str;
    }

    private void metoda1() {
        System.out.println("nic tu nie ma");
    }

    public static String seriesSum(int n) {
        double counter = 1;
        double sum = 0;
        for (int i = 0; i < n; i++)

        {
            sum = sum + (1 / counter);
            counter = counter + 3;

        }
        DecimalFormat result = new DecimalFormat("##.00");
        return (result.format(sum));

    }


    public static String printerError(String s) {
        char[] tab = s.toCharArray();
        int length = tab.length;
        int count = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 109) {
                count = count + 1;
            }


        }
        return count + "/" + length;

    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        char[] tab = str.toCharArray();
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 'a' || tab[i] == 'e' || tab[i] == 'i' || tab[i] == 'o' || tab[i] == 'u') {
                vowelsCount = vowelsCount + 1;
            }
        }
        return vowelsCount;
    }

    //--------------------------------------------------------------------------------------------------------------------------------------------------------
    public static String everyNth(String str, int n) {
        String result = "";

        if (str.length() > 0) {
            for (int i = 0; i <= str.length(); i = i + n) {
                char a = str.toCharArray()[i];
                result = result + a;

            }

        }
        return result;
    }

    private static int largestNumber(int data) {

        int[] times = new int[10];
        while (data != 0) {
            int val = data % 10;
            times[val]++;
            data = data / 10;
        }
        String largestNumber = "";
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < times[i]; j++) {
                largestNumber = largestNumber + i;
            }
        }
        return Integer.parseInt(largestNumber);
    }

    private static void sorter(int num) {
        String[] numbers = (Integer.toString(Integer.valueOf(num))).split("");
        String[] nums = Integer.toString(num).split("");
        Arrays.sort(nums);

        String result = "";

        for (String s : nums) {
            result = s + result;
        }
        System.out.println(result);
//        System.out.println(Integer.parseInt(result));
    }


    public static void nameList(String[] tab) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= 4; i++) {
            System.out.print("podaj imię ");
            tab[i] = scanner.nextLine();
        }
        for (int i = 0; i <= 4; i++) {
            System.out.println("imię to " + tab[i]);
        }
    }

    public static void nElements(int n) {
        int tablica[] = new int[n];
        int i = 0;
        while (i < n) {
            tablica[i] = i;
            i++;
        }
        for (int j = 0; j < n; j++) {
            System.out.println("wynik to " + tablica[j]);
        }
    }


}
/*
    public static String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1, str.length());

    }

    public static String frontBack(String str) {
        if (str.length() > 1) {
            return str.substring(str.length() - 1) + str.substring(1, str.length() - 1) + str.substring(0, 1);
        }
        return str;
    }
    public static String front3(String str){
        if (str.length()>=3){
            return str.substring(0,3)+str.substring(0,3)+str.substring(0,3);
        }
        return str+str+str;
    }
    public static boolean or35(int n) {
        if(n%3=0 || n%5==0){
            return true;
        }
    }*/



package pl.sda.javastart.day2;

public class IfsExample {
    public static void main(String[] args) {
       /* int a = 4;
        int b = 15;
        System.out.println(isEven(a));
        System.out.println(isEvenTernary(a));
        System.out.println(isDividableBy3and5(b));
        System.out.println(taxAdd(100, b));*/
//        System.out.println(personalData("Janina", 88, false));
//        System.out.println(isEvenTwoNumbers(2,3));
        System.out.println(isThirdSumOfFirstTwo(2,2,3));
    }

    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else
            return false;


    }

    public static boolean isEvenTernary(int a) {
        return a % 2 == 0; // ? true : false;
//        return number;
    }

    public static boolean isDividableBy3and5(int a) {
//        if (a % 3 == 0 && a % 5 == 0)
//            return true;
//        else
//            return false;
        return a % 3 == 0 && a % 5 == 0;
    }

    public static double taxAdd(double a, double b) {//fixme bigDecimal
        return a * b / 100 + a;


    }

    public static String personalData(String name, int age, boolean sexParam) {
        String gend;

        if (sexParam)
            gend = "mężczyzną";
        else
            gend = "kobietą";

        return "Cześć! Jestem " + name + " mam " + age + " lat i jestem " + gend;

    }

    public static boolean isEvenTwoNumbers(int a, int b){
        return a%2==0 && b%2==0;
    }

    public static boolean isThirdSumOfFirstTwo(int a, int b, int c){
        return a+b == c;
    }

//    public static boolean anyoneBiggerThanZero()
//
}

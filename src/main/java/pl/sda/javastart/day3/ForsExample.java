package pl.sda.javastart.day3;

public class ForsExample {
    public static void notDividableByParam(int param) {
        for (int i = 0; i <= 10; i++) {
            if (i % param == 0) {
                continue;

            }
            System.out.println(i);
        }
    }



    public static void sumNaturalNumsToLimit(int limit) {
        int sum = 0;
        for (int i = 0; ; i++) {
            if (sum + i > limit) {
                break;
            }
            sum = sum + i;
            System.out.println(sum);

        }
    }

    public static void main(String[] args) {
//        notDividableByParam(2);

//        sumNaturalNumsToLimit(1000);
    }

}

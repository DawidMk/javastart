package pl.sda.javastart.day2;

public class FourParameters {
    public static double calculateFourParameters(double a, double b, double c, double x){
        return Math.pow(a,x)+Math.pow(b,(x+1))+Math.pow(c,(x+2));
    }

    public static void main(String[] args) {
        double a = Math.pow(1,8);
        double b = Math.pow(2,9);
        double c = Math.pow(3,10);
        System.out.println("a: "+a+"\nb: "+b+"\nc: "+c);
        System.out.println(a+b+c);
        System.out.println(calculateFourParameters(1,2,3,8));
        System.out.println(calculateFourParameters(10,11,12,1));
        System.out.println(calculateFourParameters(8,8,8,3));
    }
}

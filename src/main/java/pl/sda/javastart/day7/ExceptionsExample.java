package pl.sda.javastart.day7;

public class ExceptionsExample {
    public static void main(String[] args) {
    /*    try {
            System.out.println(divide(2, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(divide(2, 2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(divideWithException(2, 0));
//        } catch (ArithmeticException e) {
        } catch (MyRuntimeException | ArithmeticException e) {
            System.out.println("wystąpił błąd: "+e.getMessage());
        }finally {
            System.out.println("blok finally");
        }
        System.out.println("hello");*/
        try {
            System.out.println(divideWithCheckedException(2,0));
        } catch (MyCheckedException e) {
            System.out.println(e.getMessage());
        }

    }

    private static int divide(int a, int b) {
        return a / b;
    }
    private static int divideWithException(int a, int b){
        if(b == 0){
            throw new MyRuntimeException("gdzie z tym zerem, kierwa");
        }
        return a/b;
    }

    private static int divideWithCheckedException(int a, int b) throws MyCheckedException{
        if(b == 0){
            throw new MyCheckedException("gdzie z tym zerem, kierwa");
        }
        return a/b;
    }
}

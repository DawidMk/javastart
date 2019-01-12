package pl.sda.javastart.rozne;

public class JavaStart {
    public static void main(String[] args) {
        Punkt punkt = new Punkt();
        punkt.setPunktX(10);
        punkt.setPunktY(20);
        punkt.increaseX();
        punkt.increaseY();
        System.out.println(punkt.increaseXbyN(10));
        System.out.println(punkt.getPunktX());
        System.out.println(punkt.getPunktY());


    }
}

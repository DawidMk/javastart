package pl.sda.javastart.day6.Homework2_new;

public class Human extends Mammal {
    @Override
    public String introduceYourself() {
        return "jestem człowiekiem";
    }

    @Override
    public String toString() {
        return super.toString(); //zawiera odwołanie do introduceYourself(), które jest nadpisywane przez metodę z tej klasy;
    }

    public Human(String name, double weight, Integer age) {
        super(name, weight, age);
    }

    public Human() {
    }
}

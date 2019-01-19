package pl.sda.javastart.day6.Homework2_new;

public class Bird extends Pet {
    public Bird(String name, double weight, Integer age, Human owner) {
        super(name, weight, age, owner);
    }

    public Bird() {
    }

    @Override
    public String introduceYourself() {
        return "jestem ptakiem";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

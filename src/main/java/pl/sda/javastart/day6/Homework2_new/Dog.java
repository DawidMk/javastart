package pl.sda.javastart.day6.Homework2_new;

public class Dog extends Pet {
    public Dog(String name, double weight, Integer age, Human owner) {
        super(name, weight, age, owner);
    }

    public Dog() {
    }

    @Override
    public String introduceYourself() {
        return "jestem psem";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

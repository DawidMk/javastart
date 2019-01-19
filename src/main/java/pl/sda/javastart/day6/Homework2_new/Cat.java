package pl.sda.javastart.day6.Homework2_new;

public class Cat extends Pet {
    public Cat(String name, double weight, Integer age, Human owner) {
        super(name, weight, age, owner);
    }

    public Cat() {
    }

    @Override
    public String introduceYourself() {
        return "jestem kotem";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


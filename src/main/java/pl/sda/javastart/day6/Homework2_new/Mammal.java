package pl.sda.javastart.day6.Homework2_new;

public class Mammal extends Animal {
    @Override
    public String introduceYourself() {
        return "jestem ssakiem";
    }

    @Override
    public String toString() {
        return introduceYourself()+"\nimię: "+getName()+"\nwaga: "+getWeight()+"\nwiek: "+getAge();
    }

    public Mammal(String name, double weight, Integer age) {
        super(name, weight, age);
    }

    public Mammal() {
    }
}
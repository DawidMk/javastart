package pl.sda.javastart.day6.Homework2_new;

public class Pet extends Animal {
    private Human owner;

    @Override
    public String introduceYourself() {
        return "jestem zwierz domowy";
    }

    @Override
    public String toString() {
        return introduceYourself() + "\nimię: " + getName() + "\nwaga: " + getWeight() + "\nwiek: " + getAge()+"\nmój właściciel to: "+owner.getName();

    }

    public Pet(String name, double weight, Integer age, Human owner) {
        super(name, weight, age);
        this.owner = owner;

    }

    public Pet() {
    }

    public Human getOwner() {
        return owner;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }
}
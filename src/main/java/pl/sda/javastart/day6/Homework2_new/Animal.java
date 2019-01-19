package pl.sda.javastart.day6.Homework2_new;


public abstract class Animal {
    private String name;
    private double weight;
    private Integer age;

    public Animal(String name, double weight, Integer age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Animal() {
    }

    public abstract String introduceYourself();

    @Override
    public abstract String toString();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}


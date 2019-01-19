package pl.sda.javastart.day6.Homework2_new;

public class OOPHomework2 {
    public static void main(String[] args) {
        Human human = new Human("Janusz Tracz",100,50);
        Human human2 = new Human("Joanna Kupa",50,40);
        Mammal animal = new Mammal("krowa",50,40);
        Dog dog = new Dog("Azor",10,5, human);
        Cat cat = new Cat("Stachu",3,2,human2);
        Bird bird = new Bird("Marian",0.1,1,human);

        System.out.println(dog.toString());
        System.out.println();
        System.out.println(cat.toString());
        System.out.println();
        System.out.println(bird.toString());

//        System.out.println(human.toString());
//        System.out.println(animal.toString());
//        dog.setName("Burek");
//        dog.setOwner(human2);
//        System.out.println(dog.getName());
        dog.getOwner().setName("Zdzichu");
        System.out.println(dog.toString());
    }
}
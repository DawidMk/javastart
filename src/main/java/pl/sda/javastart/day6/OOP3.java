package pl.sda.javastart.day6;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OOP3 {
    public static void main(String[] args) {
//        Person person1 = new Person();
        Worker worker0 = new Worker();
        Worker worker1 = new Worker("Adam", "Sidor", 123, 50, BigDecimal.valueOf(1300));
        Student student1 = new Student("Katarzyna", "Wielka", 456, 38, 120, BigDecimal.valueOf(500));
        Pensioner pensioner1 = new Pensioner("Janusz", "Tracz", 789, 80, BigDecimal.valueOf(1000));


        Person[] tab = new Person[]{worker1, student1, pensioner1};
        Object[] objects = new Object[]{worker1, student1, pensioner1};

        List<Person> peopleList = new ArrayList<>();

//        peopleList.add(person1);
        peopleList.add(worker1);
        peopleList.add(student1);
        peopleList.add(pensioner1);

//        printSomeData(person1, worker1, student1, pensioner1);
//        printFromList(peopleList);
        List<NameHolder> nameHolders = new ArrayList<>();
        nameHolders.add(worker1);
        nameHolders.add(student1);
//        nameHolders.add(pensioner1); nie implementuje interface
        printNames(nameHolders);
    }

    private static void printNames(List<NameHolder> nameHolders) {
        for (NameHolder nameHolder : nameHolders) {
            System.out.println(nameHolder.showYourName());
        }
    }

    private static void printSomeData(Person person1, Worker worker1, Student student1, Pensioner pensioner1) {
        person1.setFirstName("Janusz");
        System.out.println(worker1.getFirstName());
        System.out.println(worker1.showIncome());
        person1.introduction();
        System.out.println();
        worker1.introduction();
        student1.introduction();
        pensioner1.introduction();
    }

    private static void printFromList(List<Person> list) {
        for (Person person : list) {
            System.out.println(person.showIncome());
            if (person instanceof Worker) {
                ((Worker) person).introductionInner();
                System.out.println();
            }

        }

    }
}

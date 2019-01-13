package pl.sda.javastart.day6;

import java.math.BigDecimal;

public class OOP3 {
    public static void main(String[] args) {
        Person person1 = new Person();
        Worker worker1 = new Worker("Adam", "Sidor", 123, 50, BigDecimal.valueOf(1300));
        Student student1 = new Student("Katarzyna", "Wielka", 456, 38, 120, BigDecimal.valueOf(500));
        Pensioner pensioner1 = new Pensioner("Janusz", "Tracz", 789, 80, BigDecimal.valueOf(1000));

        person1.setFirstName("Janusz");
        worker1.setSalary(BigDecimal.valueOf(1300));

    }
}

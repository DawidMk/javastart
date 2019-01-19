package pl.sda.javastart.day7;

import pl.sda.javastart.day6.Pensioner;
import pl.sda.javastart.day6.Person;
import pl.sda.javastart.day6.Student;
import pl.sda.javastart.day6.Worker;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class CollectionsExample {


    private static final Student student1 = new Student("Jan", "Hahnel", 123, 25, 5555, BigDecimal.valueOf(1000));
    private static final Student student2 = new Student("AKoral", "Szabadaba ", 223, 25, 5556, BigDecimal.valueOf(1200));
    private static final Worker worker1 = new Worker("Andreas", "Szabadaba", 666, 40, BigDecimal.valueOf(10000));
    private static final Pensioner pensioner1 = new Pensioner("Rainer", "Hahnel", 999, 66, BigDecimal.valueOf(5000));
    private static final Pensioner pensioner2 = new Pensioner("Rainer", "Hahnel", 999, 66, BigDecimal.valueOf(5000));
    private static final Pensioner pensioner3 = new Pensioner("Rainer", null, 999, 66, BigDecimal.valueOf(5000));


    public static void main(String[] args) {
//        treeSetExample();
//        listExample();
//        hashSetExample();
//        hashMapExample();
//        namesStatsMap();
        List<Person> personList = populateList();
        personList.add(pensioner3);
/*        Map<String,Long> resultMap = personList.stream()
                .map(e -> e.getLastName() == null ? null : e.getLastName().trim())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));*/

        Map<String,Long> resultMap = personList.stream()
                .filter(e->e.getLastName()!=null)
                .map(e -> e.getLastName().trim())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        System.out.println(resultMap.toString());
    }

    private static void namesStatsMap() {
        List<Person> listOfPersons = populateList();
        listOfPersons.add(pensioner3);
        Map<String, Integer> lastNameMap = new HashMap<>();
        for (Person person : listOfPersons) {
            String lastName = person.getLastName();
            if (person.getLastName() == null) {
                lastName = null;
            } else {
                lastName = person.getLastName().trim();
            }
            if (lastNameMap.containsKey(lastName)) {
                int counter = lastNameMap.get(lastName);
                lastNameMap.replace(lastName, counter + 1);
            } else {
                lastNameMap.put(lastName, 1);
            }
        }
        System.out.println(lastNameMap);
    }

    private static void hashMapExample() {
        Map<Integer, Person> personsMap = new HashMap<>();
        personsMap.put(student1.getPersonId(), student1);
        personsMap.put(worker1.getPersonId(), worker1);
        personsMap.put(pensioner1.getPersonId(), pensioner1);
        personsMap.put(student2.getPersonId(), student2);
        personsMap.put(pensioner2.getPersonId(), pensioner2);


        System.out.println(personsMap);
    }

    private static void hashSetExample() {
        Set<Person> personSet = new HashSet<>();
//        Set<Person> personSet = new LinkedHashSet<>(); // zachowa kolejność dodawania elementów
        personSet.add(student1);
        personSet.add(student2);
        personSet.add(worker1);
        personSet.add(pensioner1);
        personSet.add(pensioner2);

        System.out.println(personSet);
        personSet.stream()
                .map(e -> e.getPersonId())
                .forEach(e -> System.out.println(e));
    }

    private static void listExample() {
        List<Person> personList = populateList();
        System.out.println(personList.contains(pensioner2));
        personList.remove(pensioner1);
        System.out.println(personList.contains(pensioner2));
        System.out.println(personList.toString());
    }

    private static List<Person> populateList() {
        List<Person> personList = new ArrayList<>(); //deklaracja List<> pozwala podmieniać typ, np ArrayList na LinkedList
        personList.add(student1);
        personList.add(student2);
        personList.add(worker1);
        personList.add(pensioner1);
        personList.add(pensioner2);
        return personList;
    }

    private static void treeSetExample() {
        TreeSet<Person> treeSet = new TreeSet<>();
//        Student student1 = new Student("Jan","Pawlacz",123,25,5555, BigDecimal.valueOf(1000));
//        Student student2 = new Student("AKoral","Szabadaba",223,25,5556, BigDecimal.valueOf(1200));


        System.out.println(student1.toString());
        treeSet.add(student2);
        treeSet.add(student1);
        System.out.println(treeSet);

        treeSet.stream()
                .map(e -> e.getFirstName())
                .forEach(e -> System.out.println(e));
    }
}

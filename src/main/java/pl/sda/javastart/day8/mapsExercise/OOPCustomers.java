package pl.sda.javastart.day8.mapsExercise;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class OOPCustomers {

    private static Customer[] people = new Customer[]{
            new Customer("Anna", "Nowak   ", 33, "1200"),
            new Customer("Beata", "Kowalska", 22, "1200"),
            new Customer("Marek", " Nowak", 25, "1250"),
            new Customer("Adam", "Twardowski", 33, "1100"),
            new Customer("Monika  ", "Kos", 25, "2500"),
            new Customer("Adam ", "Rudy", 45, "3333"),
            new Customer("Marek", "Rudy", 15, 2210),
            new Customer("Adam", "Madej", 15, 3333)
//            new Customer("Janusz", "Tracz", 15, 3333),
//            new Customer("Janusz", "Tracz", 15, 3333),
//            new Customer("Janusz", "Tracz", 16, 1000)
    };

    public static void main(String[] args) {
//        System.out.println(salariesMap()); //ctrl+shift+enter uzupelnia zamknięcie nawiasu
//        System.out.println(peopleMap());
       System.out.println("salary stats map");
        System.out.println(salaryStatsMap());
        System.out.println("salaries map");
        System.out.println(salariesMap());
        System.out.println("salary stats map stream");
        System.out.println(salaryStatsMapStream());
        System.out.println("map of maps");
        System.out.println(mapOfMaps());
        System.out.println("map of maps stream");
        System.out.println(mapOfMapsStream());
        System.out.println("map of maps 2");
        System.out.println(mapOfMaps2());
//        System.out.println(arrayToList());
//        System.out.println(arrayToListStream());
    }

    //Napisz metodę, która zamieni tablicę people na listę people
    private static List<Customer> arrayToList() {
//        return new ArrayList<Customer>(Arrays.asList(people));
        List<Customer> customers = new ArrayList<>();
        for (Customer customer : people) {
            customers.add(customer);
        }
        return customers;
    }

    // Napisz metodę, która zamieni tablicę people na listę people
    private static List<Customer> arrayToListStream() {
        return Arrays.stream(people)
                .collect(Collectors.toList());
    }

    //Napisz metodę, która przyjmie tablicę people i zwróci listę Stringów
    private List<String> nameAndLastNameListStream() {
        return arrayToList().stream()
                .map(e -> e.getName() + " " + e.getLastName())
                .collect(Collectors.toList());
    }

    //Napisz metodę, która zwróci mapę osób
    private static Map<Integer, Customer> peopleMap() {
        Map<Integer, Customer> resultMap = new HashMap<>();
        for (Customer customer : people) {
            resultMap.put(customer.getId(), customer);
        }
        return resultMap;
    }

    private static Map<BigDecimal, List<String>> salariesMap() {
        Map<BigDecimal, List<String>> resultMap = new HashMap<>();
        for (Customer person : people) {
            if (resultMap.containsKey(person.getSalary())) {
                List<String> innerList = resultMap.get(person.getSalary());
                innerList.add(person.getName() + " " + person.getLastName() + " " + person.getId());
            } else {
                List<String> innerList = new ArrayList<>();
                innerList.add(person.getName() + " " + person.getLastName() + " " + person.getId());
                resultMap.put(person.getSalary(), innerList);
            }
        }
        return resultMap;
    }

    //Napisz metodę, która zwróci mapę osób według zarobków
    private static Map<Double, Integer> salaryStatsMap() {
        Map<Double, Integer> resultMap = new HashMap<>();
        for (Customer customer : people) {
            Double salary = customer.getSalary().doubleValue();
            Integer c = resultMap.get(salary) == null ? 0 : resultMap.get(salary);
            resultMap.put(salary, c + 1);
        }
        return resultMap;
    }

    //Napisz metodę, która zwróci mapę osób według zarobków
    private static Map<Double, Long> salaryStatsMapStream() { //TODO convert Long to Integer
        return Arrays.stream(people)
                .collect(Collectors.groupingBy((Customer customer) -> customer.getSalary().doubleValue(), Collectors.counting()));
    }

// próbna metoda
    private static Map<String, Map<Double, Integer>> mapOfMaps() {
        Map<String, Map<Double, Integer>> resultMap = new HashMap<>();

        for (Customer customer : people) {
            Map<Double, Integer> innerMap;
            Double salary = customer.getSalary().doubleValue();
            if (resultMap.containsKey(customer.getName().trim())) {
                innerMap = resultMap.get(customer.getName().trim());
                innerMap.put(salary, salaryStatsMap().get(salary));
                resultMap.put(customer.getName().trim(), innerMap);
            } else {
                innerMap = new HashMap<>();
                innerMap.put(salary, salaryStatsMap().get(salary));
                resultMap.put(customer.getName(), innerMap);
            }
        }
        return resultMap;
    }
//NApisz metodę, która zwróci mapę map
    private static List<Customer> sortedPeople() {
 /*       List<Customer> peopleList = new ArrayList<>();
       for (Customer customer : people) {
            peopleList.add(customer);
        }*/
        List<Customer> peopleList = arrayToList();
        Collections.sort(peopleList, (p1, p2) -> p1.getName().compareTo(p2.getName()));
        return peopleList;
    }

    private static Map<String, Map<Double, Integer>> mapOfMaps2() {
        Map<String, Map<Double, Integer>> outerMap = new HashMap<>();
        Map<Double, Integer> innerMap = new HashMap<>();
        for (Customer customer : sortedPeople()) {
            Double salary = customer.getSalary().doubleValue();
//            Map<Double, Integer> innerMap = new HashMap<>();
//            Integer c = innerMap.get(salary) == null ? 0 : innerMap.get(salary);
            if (outerMap.containsKey(customer.getName().trim())) {
                Integer c = innerMap.get(salary) == null ? 0 : innerMap.get(salary);
                innerMap = outerMap.get(customer.getName().trim());
                innerMap.put(salary, c + 1);
                outerMap.put(customer.getName().trim(), innerMap);
            } else {
                innerMap = new HashMap<>();
                Integer c = innerMap.get(salary) == null ? 0 : innerMap.get(salary);
                innerMap.put(salary, c + 1);
                outerMap.put(customer.getName().trim(), innerMap);
            }
        }
        return outerMap;
    }
//NApisz metodę, która zwróci mapę map
    private static Map<String, Map<Double, Long>> mapOfMapsStream() {
        return Arrays.stream(people)
                .collect(Collectors.groupingBy((Customer customer) -> customer.getName().trim(), Collectors.groupingBy((Customer c) -> c.getSalary().doubleValue(),
                        Collectors.counting())));
    }
}
// UNUSED CODE
/*    private static Map<BigDecimal, List<String>> salariesMap() {
        Map<BigDecimal, List<String>> resultMap = new HashMap<>();
        for (Customer person : people) {
            if (resultMap.containsKey(person.getSalary())) {
                List<String> innerList = resultMap.get(person.getSalary());
                innerList.add(person.getName() + " " + person.getLastName() + " " + person.getId());
            } else {
                List<String> innerList = new ArrayList<>();
                innerList.add(person.getName() + " " + person.getLastName() + " " + person.getId());
                resultMap.put(person.getSalary(), innerList);
            }
        }
        return resultMap;
    }*/



/*
    private static Map<BigDecimal, List<String>> salariesMapString() {
        Map<BigDecimal, List<String>> resultMap = new HashMap<>();
        customerList().stream()
                .collect(Collectors.groupingBy())

    }

      private static Map<Double, Integer> salaryStatsMap2() {
        Map<Double, Integer> resultMap = new HashMap<>();
        Integer counter = 1;
        for (Customer customer : people) {
            if (!resultMap.containsKey(customer.getSalary().doubleValue())) {
                resultMap.put(customer.getSalary().doubleValue(), 1);
            } else {
                resultMap.replace(customer.getSalary().doubleValue(), counter++);
            }
        }
        return resultMap;
    }



    */




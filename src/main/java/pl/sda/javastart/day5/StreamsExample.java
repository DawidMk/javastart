package pl.sda.javastart.day5;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

public class StreamsExample {
    private static String[] animals = new String[]{"cat", "dog ", "mouse", "rat",
            "pig", "rabbit", "hamster", " ", "parrot", "cat", "",
            "dog", "cat", "  pig", "dog", null, "parrot"};

    public static void main(String[] args) {
//        firstMethod();
//        secondMethod();
        sorter();

    }

    private static void firstMethod() {
        for (String animal : animals) {
            if (animal == null) {
                continue;
            }
            animal = animal.trim();
            if (animal.length() >= 4) {
                //todo zrobić unikalność
                System.out.println(animal);
            }

        }

        System.out.println("\nużycie streama\n");
        Arrays.stream(animals)
                .filter(e -> e != null)
                .map(e -> e.trim())
                .filter(e -> e.length() >= 4)
                .distinct()
                .forEach(e -> System.out.println(e));
    }

    private static void secondMethod() {
//        for (String animal : animals) {
            /*if (animal == null) {
                continue;
            }
            //todo zrobić przecinki, a na końcu kropkę
        }*/
        System.out.println("\nstream metoda 2");
        String result = Arrays.stream(animals)
                .filter(e -> StringUtils.isNotBlank(e))
                .collect(Collectors.joining(","));
        System.out.println(result + ".");
    }

    private static void sorter() {
//        String name1 = "Ola";
//        String name2 = "Anna";
//        String name1 = "Anna";
//        String name2 = "Ola";
//        System.out.println(name1.compareTo(name2));
//        String[] names = new String[]{"anna", "ola"};
        System.out.println("sortowanie alfabetyczne: ");
        Arrays.stream(animals)
                .filter(e -> StringUtils.isNotBlank(e))
                .map(e -> e.trim())
                .distinct()
                .sorted((e, f) -> e.compareTo(f))
                .forEach(e -> System.out.print(e + " "));
        System.out.println("\nsortowanie po długości łańcuchów: ");
        Arrays.stream(animals)
                .filter(e -> StringUtils.isNotBlank(e))
                .map(e -> e.trim())
                .distinct()
                .sorted((e, f) -> Integer.valueOf(e.length()).compareTo(Integer.valueOf(f.length())))
                .forEach(e -> System.out.print(e + " "));
    }
}

package pl.sda.javastart.day8.fileReader;

import jdk.jfr.events.FileReadEvent;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SplittableRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class RomNJul {
    private static final String PATH_TO_FILE = "C:\\Users\\Dell\\Documents\\java_kurs\\romeo_juliet.txt";

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("liczba slow swykle petle");
        countWords1();
//        printAndNumberLines();
        System.out.println("liczba linii");
        System.out.println(lineCounter());
        System.out.println("liczba slow stream");
        System.out.println(countWordsStream());
    }

    private static void printAndNumberLines() {
        AtomicInteger c = new AtomicInteger(0);
        try (Stream<String> file = Files.lines(Paths.get(PATH_TO_FILE))) {
            file
//                    .map(e -> c.getAndIncrement(); return e;)
//                    .forEach(e-> System.out.println(c+" "+e));
                    .forEach(e -> {
                        c.getAndIncrement();
                        System.out.println(c + " " + e);
                    });
        } catch (IOException e) {
            e.getMessage();
        }
    }

    private static void countWords1() throws FileNotFoundException {
        Integer c = 0;
        FileReader fileReader = new FileReader(PATH_TO_FILE);
        try {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            List<String> lines = new ArrayList<>();
            String word;
            List<String> words = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
            for (String s : lines) {
                String[] lineWords = s.split(" ");
                words.addAll(Arrays.asList(lineWords));
            }
            for (String w : words) {
                c++;
            }
            System.out.println(c);
        } catch (IOException e) {
            e.getMessage();
        }
    }

    private static Long lineCounter() {
        Long c = 0L;
        try (Stream<String> file = Files.lines(Paths.get(PATH_TO_FILE))) {
            c = file.count();
        } catch (IOException e) {
            e.getMessage();
        }
        return c;
    }

    private static Long countWordsStream() {
        Long c = 0L;
        try (Stream<String> file = Files.lines(Paths.get(PATH_TO_FILE))) {
            c = file
                    .flatMap(e -> Stream.of(e.split(" ")))
                    .count();
        } catch (IOException e) {
            e.getMessage();
        }
        return c;
    }
}





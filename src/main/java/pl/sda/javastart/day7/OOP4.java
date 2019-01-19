package pl.sda.javastart.day7;

import pl.sda.javastart.day4.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class OOP4 {
    public static void main(String[] args) {
//        createWhiteCar();
//        getPLColorsFromEnum();
    ArrayList<Integer> tab = new ArrayList<>();
    tab.add(1);
    tab.add(2);
    tab.add(3);
    tab.add(1,3);
        System.out.println(tab.get(1));

    }

    private static void getPLColorsFromEnum() {
        System.out.println(Arrays.toString(ColourEnum.values()));
        for(ColourEnum x : ColourEnum.values()){
            System.out.println(x.getColourNamePL());
        }

        Arrays.stream(ColourEnum.values())
                .forEach(e-> System.out.println(e.getColourNamePL()));
        Arrays.stream(ColourEnum.values())
                .map(e -> e.getColourNamePL())
                .forEach(e -> System.out.println(e));
    }

    private static void createWhiteCar() {
        Car car = new Car();
        car.setColor(ColourEnum.WHITE);
        System.out.println(car.getColor().getColourNamePL());
    }
}

package pl.sda.javastart.day4;

import java.math.BigDecimal;

public class OOP {
    public static void main(String[] args) {
        Car car = new Car();
        car.setManufacturer("Skoda");
        car.setModel("Fabia");
        System.out.println(car); //todo
        car.setBasePrice(BigDecimal.valueOf(1000));

        System.out.println(car);

        CarOption leatherSeats = new CarOption();
        leatherSeats.setOptionName("leather seats");
        leatherSeats.setOptionPrice(BigDecimal.valueOf(100));
        leatherSeats.setChecked(true);

        CarOption radio = new CarOption();
        radio.setOptionName("panasonix");
        radio.setOptionPrice(BigDecimal.valueOf(200));
        radio.setChecked(true);

        car.setAdditionalOptions(new CarOption[]{radio, leatherSeats});


        System.out.println(car.getManufacturer());
        System.out.println(leatherSeats.isChecked());
        System.out.print("sumaryczna cena ");
        System.out.println(car.fullPrice());
        System.out.println(car.toString());


    }

    public static BigDecimal fullPrice_old(Car car) { //przykład użycia metody z odwołaniami do metod
        BigDecimal sum = car.getBasePrice();
        for (CarOption i : car.getAdditionalOptions()) {
            sum = sum.add(i.getOptionPrice());
        }
        return sum;

    }


}



package pl.sda.javastart.day4.homework;

import java.util.Arrays;

public class OOPtrain {
    public static void main(String[] args) {
        Train train = new Train();
        Car car1 = new Car();
        car1.setFoodAvailibility(true);
        car1.setCarClass(1);
        car1.setWeight(50);
        car1.setNumOfPassengers(40);

        Car car2 = new Car();
        car2.setFoodAvailibility(false);
        car2.setCarClass(2);
        car2.setWeight(55);
        car2.setNumOfPassengers(80);

        Car car3 = new Car();
        car3.setFoodAvailibility(false);
        car3.setCarClass(3);
        car3.setWeight(60);
        car3.setNumOfPassengers(100);
//        train.setAttachedCars(new Car[]{});




        train.setName("Srebrna Szczała");
        train.setWeight(100);
        train.setNumOfCars(2);
        train.setNumOfPassengers(220);
//        train.setAttachedCars(new Car[]{car1,car2});
//        train.setAttachedCars(new Car[]{car1});
        train.attachSingleCar(car1);
        System.out.println(train.toString());
        System.out.println();
//        train.attachSingleCar(car1);
        train.attachSingleCar(car2);
        System.out.println(train.toString());
        System.out.println();
        train.attachSingleCar(car3);
        System.out.println(train.toString());
    }
}

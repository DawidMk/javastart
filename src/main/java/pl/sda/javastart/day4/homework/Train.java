package pl.sda.javastart.day4.homework;

import java.util.Arrays;

public class Train {
    private double weight;
    private String name;
    private int numOfPassengers;
    private int numOfCars;
    private Car[] attachedCars;
//    private Car singleCar;

    public int getNumOfCars() {
        return numOfCars;
    }

    public void setNumOfCars(int numOfCars) {
        this.numOfCars = numOfCars;
    }

    public int getNumOfPassengers() {

        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {

        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Car[] getAttachedCars() {
        return attachedCars;
    }

    public void setAttachedCars(Car[] attachedCars) {
        this.attachedCars = attachedCars;
    }

    public void attachSingleCar(Car singleCar) {

//            setAttachedCars(new Car[]{});

            attachedCars = Arrays.copyOf(attachedCars, attachedCars.length + 1);
            attachedCars[attachedCars.length - 1] = singleCar;
        }



    @Override
    public String toString() {
        return "parametry pociągu:\nmasa: " + weight + "\nnazwa: " + name + "\nliczba pasażerów: " + numOfPassengers + "\nliczba wagonów: " + numOfCars + "\nwagony:\n" + Arrays.toString(attachedCars);
    }
}

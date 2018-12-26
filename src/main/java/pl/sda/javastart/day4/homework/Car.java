package pl.sda.javastart.day4.homework;

public class Car {
    private double weight;
    private int carClass;
    private int numOfPassengers;
    private boolean foodAvailibility;

    public boolean isFoodAvailibility() {
        return foodAvailibility;
    }

    public void setFoodAvailibility(boolean foodAvailibility) {
        this.foodAvailibility = foodAvailibility;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    public int getCarClass() {
        return carClass;
    }

    public void setCarClass(int carClass) {
        this.carClass = carClass;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString(){
        return "\nparametry wagonu:\nklasa: "+carClass+"\nmasa: "+weight+"\nliczba miejsc: "+numOfPassengers+"\ndostępność wyżywienia: "+foodAvailibility;
    }
}

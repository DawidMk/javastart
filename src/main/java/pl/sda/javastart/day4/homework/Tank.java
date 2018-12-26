package pl.sda.javastart.day4.homework;

public class Tank {
    private double weight;
    private String name;
    private double fuelTank;
    private double fuelConsumptionPer100km;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(double fuelTank) {
        this.fuelTank = fuelTank;
    }

    public double getFuelConsumptionPer100km() {
        return fuelConsumptionPer100km;
    }

    public void setFuelConsumptionPer100km(double fuelConsumptionPer100km) {
        this.fuelConsumptionPer100km = fuelConsumptionPer100km;
    }

    @Override
    public String toString() {
        return "jestem czołgiem o masie " + weight + " ton, nazwie " + name + ", oraz spalam " + fuelConsumptionPer100km + " litrów paliwa na 100 km";
    }

    public String fuelConsumption(double amountOfFuel) {
        return "zasięg czołgu wynosi " + amountOfFuel * 100 / fuelConsumptionPer100km + " km przy " + amountOfFuel + " litrów paliwa";
    }
}

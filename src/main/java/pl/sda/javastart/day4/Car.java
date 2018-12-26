package pl.sda.javastart.day4;

import java.math.BigDecimal;

public class Car {
    private String model;
    private String color;
    private String manufacturer;
    private String vin;
    private int hp;
    private BigDecimal basePrice;
    private int doorNumber;
    private CarOption[] additionalOptions;
//    private BigDecimal fullPrice;


    public BigDecimal fullPrice() {
        BigDecimal sum = basePrice;
        if (basePrice == null) {
            return sum == null ? BigDecimal.ZERO : sum; //fixme
        }
        for (CarOption i : additionalOptions) {
            sum = sum.add(i.getOptionPrice());
        }
        return sum;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public CarOption[] getAdditionalOptions() {
        return additionalOptions;
    }

    public void setAdditionalOptions(CarOption[] additionalOptions) {
        this.additionalOptions = additionalOptions;
    }

    @Override
    public String toString() {
        if (additionalOptions == null) {
            return manufacturer + " " + model + " " + basePrice;
        } else {
            return manufacturer + " " + model + " " + fullPrice();
        }
    }
}



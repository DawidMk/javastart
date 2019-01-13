package pl.sda.javastart.day6;

import java.math.BigDecimal;

public class Pensioner extends Person {
    private BigDecimal pension;

    public Pensioner() {
    }

    public Pensioner(String firstName, String lastName, Integer personId, Integer age, BigDecimal pension) {
        super(firstName, lastName, personId, age);
        this.pension = pension;
    }

    public BigDecimal getPension() {
        return pension;
    }

    public void setPension(Integer BigDecimal) {
        this.pension = pension;
    }


}

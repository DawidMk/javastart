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
    @Override
    public BigDecimal showIncome() {
        return pension;
    }
    public void introduction() {
        super.introduction();
        System.out.print(" i emerytem");
    }

    public BigDecimal getPension() {
        return pension;
    }

    public void setPension(Integer BigDecimal) {
        this.pension = pension;
    }


}

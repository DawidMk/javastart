package pl.sda.javastart.day6;

import java.math.BigDecimal;

public class Worker extends Person {
    private BigDecimal salary;

    public Worker() {
    }

    public Worker(String firstName, String lastName, Integer personId, Integer age, BigDecimal salary) {
        super(firstName, lastName, personId, age);
        this.salary = salary;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

}

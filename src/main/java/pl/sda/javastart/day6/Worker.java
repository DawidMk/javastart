package pl.sda.javastart.day6;

import java.math.BigDecimal;

public class Worker extends Person {
    private BigDecimal salary;

    public Worker() {
    }

    public Worker(String firstName, String lastName, Integer personId, Integer age, BigDecimal salary) {
        //super(); - jeśli nie napiszę super z params, to wywoła się domyślnie pusty super()
        super(firstName, lastName, personId, age); //todo zapytać czy trzeba to wymieniać
        this.salary = salary;
    }


    @Override
    public BigDecimal showIncome() {
        return salary;
    }

    public void introduction() {
        super.introduction();
        System.out.println(" i robolem");
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

}

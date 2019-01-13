package pl.sda.javastart.day6;

import java.math.BigDecimal;

public class Worker extends Person implements FlatInfoHolder, NameHolder {
    private BigDecimal salary;

    public Worker() {
    }

    public Worker(String firstName, String lastName, Integer personId, Integer age, BigDecimal salary) {
        //super(); - jeśli nie napiszę super z params, to wywoła się domyślnie pusty super()
        super(firstName, lastName, personId, age);
        this.salary = salary;
    }

    @Override
    public String showYourName() {
        return getFirstName() + " " + getLastName();
//        return super.getFirstName() + " " + super.getLastName(); super nie musi być
    }

    @Override
    public String showAddress() {
        return null;
    }

    @Override
    public BigDecimal showIncome() {
        return salary;
    }

    public void introductionInner() {
        super.introduction();
        System.out.print(" i robolem");
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

}

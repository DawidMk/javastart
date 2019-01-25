package pl.sda.javastart.day8.mapsExercise;

import java.math.BigDecimal;
import java.util.Objects;

public class Customer {
    private String name;
    private String lastName;
    private Integer id;
    private Integer age;
    private BigDecimal salary;
//     static Integer counter;
    private static Integer counter = 1;

//    static{
//        counter = 1;
//    }

    {
        id = counter++;
    }

    public Customer(String name, String lastName, int age, String salary) {
//        this.name = name;
//        this.lastName = lastName;
//        this.age = age;
//        this.salary = BigDecimal.valueOf(Integer.valueOf(salary));
        this(name, lastName, age, Integer.valueOf(salary)); // 'this' wywołuje drugi konstruktor

    }

    public Customer(String name, String lastName, Integer age, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = BigDecimal.valueOf(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) &&
                Objects.equals(lastName, customer.lastName) &&
                Objects.equals(id, customer.id) &&
                Objects.equals(age, customer.age) &&
                Objects.equals(salary, customer.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, id, age, salary);
    }*/
}

package pl.sda.javastart.day6;

import java.math.BigDecimal;

public class Person {
    private String firstName;
    private String lastName;
    private Integer personId;
    private Integer age;

    public Person() {
    }

    public Person(String firstName, String lastName, Integer personId, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personId = personId;
        this.age = age;
    }

    public BigDecimal showIncome(){
        return null;
    }

    public void introduction(){
        System.out.print("jestem człekiem");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}

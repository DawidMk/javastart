package pl.sda.javastart.day5;

import java.util.Objects;

public class Person {
    private String name;
    private String lastName;
    private int identity;
    static int counter; //int albo Integer

    static {
        counter = 0;
    }

    {
//        System.out.println("blok inicjalizujący");
        this.identity = counter++;
    }

    public Person() {
    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Person(String name, String lastName, int identity) {
//        setName(name);
//        setLastName(lastName);
//        setIdentity(identity);
        this.name = name;
        this.lastName = lastName;
        this.identity = identity;
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

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }

    public static void printSth() {
        System.out.println("sth");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return identity == person.identity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identity);
    }
}


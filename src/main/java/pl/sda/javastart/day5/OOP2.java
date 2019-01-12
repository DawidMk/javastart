package pl.sda.javastart.day5;

import pl.sda.javastart.day1.Calculator;

public class OOP2 {

    public static void main(String[] args) {
    /*    personsExample();
        referenceExample();
//        Person.printSth();
        Person person1 = new Person();
        Person person2 = new Person();
        System.out.println(person1.getIdentity());
        System.out.println(person2.getIdentity());
        System.out.println("ile jest ludzi na świecie " + Person.counter);*/


        System.out.println(CalculatorUtils.addStatic(1, 2));
        CalculatorUtils calc = new CalculatorUtils();
        System.out.println(calc.add(1, 23));


    }

    private static void referenceExample() {
        Long val1 = 127L;
        Long val2 = 127L;
//        System.out.println(val1==val2);

        long val3 = 128L;
        long val4 = 128L;
//        System.out.println(val3 == val4);
    }

    private static void personsExample() {
        Person person1 = new Person();
        Person person2 = new Person();
//        Person person3 = new Person("Anna","Nowak",100);
        person1.setName("Anna");
        person1.setLastName("Nowak");
        person1.setIdentity(100);

        person2.setName("Anna");
        person2.setLastName("Nowak");
        person2.setIdentity(100);

        System.out.println(person1.equals(person2));
//        System.out.println(person3.getName()+" "+person3.getLastName());
//        person3.setName("Joanna");
//        System.out.println(person3.getName()+" "+person3.getLastName());


    }
}

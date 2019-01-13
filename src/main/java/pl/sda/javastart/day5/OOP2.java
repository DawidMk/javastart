package pl.sda.javastart.day5;

public class OOP2 {

    public static void main(String[] args) {
//        personsExample();
//        referenceExample();*/
//        staticFinal();
        TestPerson person1 = new TestPerson("Anna", "Joanna");
        TestPerson person2 = new TestPerson("Anna", "Joanna");
        System.out.println(person1.getIdentity());
        System.out.println(person2.getIdentity());
    }

    private static void staticFinal() {
        TestPerson person1 = new TestPerson();
//      TestPerson person2 = new TestPerson();
//        System.out.println(person1.getIdentity());
//        System.out.println(person2.getIdentity());
//        System.out.println("ile jest ludzi na świecie " + TestPerson.counter);*/


//        System.out.println(CalculatorUtils.addStatic(1, 2));
//        CalculatorUtils calc = new CalculatorUtils();
//        System.out.println(calc.add(1, 23));

        person1.setName("Janina");
        ExperimentalObject obj = new ExperimentalObject(1, 2, person1);
        System.out.println(obj.getFinalImmutableVal());
        System.out.println(obj.getNotFinalImmutableVal());
        obj.setNotFinalImmutableVal(6);
        System.out.println(obj.getNotFinalImmutableVal());
        System.out.println(obj.getPerson().getName());
        obj.getPerson().setName("Ola");
        System.out.println(obj.getPerson().getName());
        TestPerson personFromObj = obj.getPerson();
        personFromObj.setName("Anna");
        System.out.println(personFromObj.getName());
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
        TestPerson person1 = new TestPerson();
        TestPerson person2 = new TestPerson();
//        TestPerson person3 = new TestPerson("Anna","Nowak",100);
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

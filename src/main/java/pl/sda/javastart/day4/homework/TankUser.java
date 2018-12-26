package pl.sda.javastart.day4.homework;

public class TankUser {
    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.setFuelConsumptionPer100km(50);
        tank.setFuelTank(200);
        tank.setName("Rudy");
        tank.setWeight(70);
        System.out.println(tank.toString());
        System.out.println(tank.fuelConsumption(21.37));


    }
}

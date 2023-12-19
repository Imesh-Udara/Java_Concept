package BroCode.thirdDay.Inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.go();

        Bicyce bike = new Bicyce();
        bike.stop();

        System.out.println(car.speed);
        System.out.println(car.doors);
        System.out.println(bike.padals);

    }
}

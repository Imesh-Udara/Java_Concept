package BroCode.forthDay.Encapsulation;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Chevrote","Camero",2022);
        System.out.println(car.getYear());
        System.out.println(car.getMake());

        car.setYear(2023);
        car.setMake("modelss");

        System.out.println(car.getMake());
        System.out.println(car.getModel());


        System.out.println(car.getYear());

    }
}

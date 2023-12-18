package BroCode.secondDay.OOP;

public class OOP {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car myCar2 = new Car();

        System.out.println(myCar.model);
        System.out.println(myCar.make);
        System.out.println();
        System.out.println(myCar2.model);
        System.out.println(myCar2.make);

        myCar.drive();
    }
}

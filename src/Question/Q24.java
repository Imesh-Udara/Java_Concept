package Question;

import java.util.ArrayList;
import java.util.LinkedList;

public class Q24 {
    public static void main(String[] args) {
        interface Vehicla{
            public void VehicleSound(); // interface method (does not have a body)
            public void Strat();
            public void brgeak();
        }

        LinkedList<String> cars = new LinkedList<String>();
        cars.add("wnne");
        cars.add("BMW");
        cars.add("dhdh");

        cars.addFirst("Sheeelqa");
        cars.addLast("neeewla");
        System.out.println(cars);
    }
}

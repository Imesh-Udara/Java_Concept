package BroCode.firstDay;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(9);
        double y = random.nextDouble(2);
        System.out.println("Random Value is: "+ x + "\n" + y);
    }
}

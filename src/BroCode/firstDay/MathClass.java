package BroCode.firstDay;

import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        double x ;
        double y ;
        double z ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x value: ");
        x = scanner.nextDouble();
        System.out.println("Enter y value: ");
        y = scanner.nextDouble();
        z = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));

        System.out.println(z);

        scanner.close();
    }
}

package BroCode.firstDay;

import java.util.Scanner;

public class ScannerInJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your favorite food? ");
        String food = scanner.nextLine();

        System.out.println("Hello "+ name);
        System.out.println("Your age is "+ age);
        System.out.println("Your food is "+ food);
    }
}

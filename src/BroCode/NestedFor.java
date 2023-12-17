package BroCode;

import java.util.Scanner;

public class NestedFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row;
        int column;
        String symbol = "";

        System.out.println("Enter row: ");
        row = scanner.nextInt();

        System.out.println("Enter columns: ");
        column = scanner.nextInt();

        System.out.println("Enter row: ");
        symbol = scanner.next();

        for(int i=1;i<=row;i++){
            System.out.println();
            for (int j=1;j<=column;j++){
                System.out.print(symbol);
            }
        }

    }
}

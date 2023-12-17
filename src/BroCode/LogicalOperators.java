package BroCode;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("you a playing a game!. Press q or Q to quite");
        String response = scanner.next();

        if(response.equals("q") || response.equals("Q")){
            System.out.println("You quit the game");
        }else {
            System.out.println("You are still play the game");
        }
        
    }
}

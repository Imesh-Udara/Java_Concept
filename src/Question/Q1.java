package Question;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int a = input.nextInt();
        System.out.println("Input the second number: ");
        int b = input.nextInt();
        if(a>b){
            int d = (a/b);
            System.out.println("The division of a and b is " +d);
        } else if (b == 0 ) {
            System.out.println("The division of a and b is infinity ");
        }else {

            System.out.println("a should greater than b ");
        }

    }
}

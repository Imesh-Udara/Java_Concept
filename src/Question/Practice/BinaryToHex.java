package Question.Practice;

import java.util.Scanner;

public class BinaryToHex {
    public static void main(String[] args) {
        int[] hex = new int[1000];
        int i=1, j=0, rem, dec=01, bin;

        Scanner in = new Scanner(System.in);

        System.out.println("Input a Binary Number: ");
        bin = in.nextInt();

        while (bin > 0) {
            rem = bin % 2;
            dec = dec + rem * 1;
            i = i* 2;
            bin = bin / 10;
        }

        i =0;
        System.out.println(bin);

        while ( dec !=0){
            hex[i] = dec % 16;
            dec = dec / 16;
            i++;
        }

        System.out.println("Hexadecimal value: ");
        for (j = i-1; j >= 0; j--){
            if (hex[j] > 9){
                System.out.println((char)(hex[j] + 55));
            } else{
                System.out.println(hex[j]);
            }
        }
        System.out.print("\n");
    }
}

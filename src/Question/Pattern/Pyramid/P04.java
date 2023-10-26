package Question.Pattern.Pyramid;

import java.util.Scanner;

public class P04 {
    static void inverted_half_pyramid(int n){
        int i,j;
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }

    static void hollow_invented_half_pyramid(int n){

        int i,j;
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                if(i==n ||i ==1 ){
                    System.out.print("*");
                }else {

                }

            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int rows;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        rows = sc.nextInt();

        inverted_half_pyramid(rows);
    }
}

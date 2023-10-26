package Question.Pattern.Pyramid;

import java.util.Scanner;

public class P03 {

    static void half_pyramid(int n){
        int i,j;
        for(i=1;i<=n;i++){
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int rows;
        Scanner sc = new Scanner(System.in);
        System.out.println("Rows: ");
        rows = sc.nextInt();
        System.out.print("\n");
        half_pyramid(rows);
    }
}

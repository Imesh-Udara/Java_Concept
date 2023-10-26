package Question.Pattern.Rectangle;

import java.util.Scanner;

public class P01 {

    static void solid_rectangle(int n, int m){
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {

        int rows,columns;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number of Rows: ");
        rows = sc.nextInt();
        System.out.print("\nEnter number of Columns: ");
        columns = sc.nextInt();
        System.out.println("\n");
        solid_rectangle(rows,columns);
    }
}

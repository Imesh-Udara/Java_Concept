package Question.Pattern.Rectangle;

import java.util.Scanner;

public class P02 {


    static void rectangle (int n,int m){
        int i,j;
        for(i=1;i<=n;i++){
            for (j=1;j<=m;j++){
                if(j==1 || i==1 || i==n || j==m){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }


            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int rows,columns;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nThe Rows: ");
        rows = scanner.nextInt();
        System.out.print("\nThe Columns");
        columns = scanner.nextInt();
        System.out.print("\n");
        rectangle(rows,columns);
    }
}

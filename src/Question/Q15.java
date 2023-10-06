package Question;

import java.util.Scanner;

public class Q15 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int r = 0;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++){
                if(j==0){
                    r = r + (a + (int)Math.pow(2,j)*b);
                }else{
                    r = r + ((int)Math.pow(2,j)*b);
                }
                System.out.print(r + " ");
            }
            System.out.println();
        }
        in.close();
    }
}

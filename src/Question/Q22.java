package Question;


import java.util.Scanner;

public class Q22 {
    static int B;
    static int H;
    static boolean flag = true;

    static{
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        scanner.close();

        try{
            if(B <= 0 || H<= 0){
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch(Exception e){
            System.out.println(e);
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        if(flag){
            int area = B*H;
            System.out.println(area);
        }
    }
}

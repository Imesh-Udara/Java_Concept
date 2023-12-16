package BroCode;

public class SwapVariables {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("New values of x and y" +"\nx: "+ x +"\ny: "+ y);
    }
}

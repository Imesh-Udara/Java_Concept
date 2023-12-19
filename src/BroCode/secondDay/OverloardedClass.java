package BroCode.secondDay;

public class OverloardedClass {
    public static void main(String[] args) {
        int z = add(2,3,6);
        System.out.println(z);
    }

    static  int add(int x, int y){
        System.out.println("Case #01");
        return x + y;
    }

    static  int add(int x, int y, int z){
        System.out.println("Case #02");
        return x + y +z;
    }
}

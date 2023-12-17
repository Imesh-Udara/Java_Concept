package BroCode;

public class JavaArray {
    public static void main(String[] args) {

        String[] cars = new String[3];

        cars[0] = "BMW";
        cars[1] = "Audi";
        cars[2] = "Benz";

        for(int i=0;i<cars.length;i++){
            System.out.println(cars[i]);
        }
    }
}

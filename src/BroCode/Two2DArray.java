package BroCode;

public class Two2DArray {
    public static void main(String[] args) {
        String[][] cars = new String[3][3];

        cars[0][0] = "Cammero";
        cars[0][1] = "Corvette";
        cars[0][2] = "BMW";
        cars[1][0] = "Mustang";
        cars[1][1] = "Ranger  ";
        cars[1][2] = "Silverdo";
        cars[2][0] = "Mustang";
        cars[2][1] = "Ranger  ";
        cars[2][2] = "Silverdo";

        for(int i =0 ; i< cars.length;i++){
            System.out.println();
            for(int j = 0;j< cars[i].length;j++){
                System.out.print(cars[i][j]+" ");
            }
        }
    }
}

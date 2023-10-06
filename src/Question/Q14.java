package Question;

public class Q14 {
    public static int contains(int[] arr, int item){
        for(int n =0 ; n < arr.length; n++){
            System.out.println("1111111111111");
            if(item == n){
                System.out.println("000000000000");
                return n;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] my_array1 = new int[] {
                1897, 2045, 5678, 9087, 2013,
                6900, 2234, 6788, 9933, 7803,
                8794, 6611, 2223, 9970, 7890
        };
        System.out.println(contains(my_array1,2013));
        System.out.println(contains(my_array1,2223));
    }
}

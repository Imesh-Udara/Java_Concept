package Question;

public class Q13 {
    public static boolean contains(int[] arr, int item){
        for(int n : arr){
            if(item == n){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] my_array1 = {
                1897, 2045, 5678, 9087, 2013,
                6900, 2234, 6788, 9933, 7803,
                8794, 6611, 2223, 9970, 7890
        };
        System.out.println(contains(my_array1,2013));
        System.out.println(contains(my_array1,2223));
    }
}

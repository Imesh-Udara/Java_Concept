package Question;

import java.util.Arrays;
import java.util.Collections;

public class Q6 {
    public static void main(String[] args) {

        Integer arr[] = new Integer[]{1,4,17,7,25,3,100};
        int k =2;
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr)); //write the array
        System.out.println("K' th smallest element of the said array: ");
        Arrays.sort(arr); //sort the array
//        System.out.println(arr[0]);
        System.out.println(arr[k-1] + " ");
        System.out.println("\nK'th largest element of the said array: ");
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(arr[k-1] + "");

    }
}

package Theory.ArrayCopy;

//copyOf() method

import java.util.Arrays;

public class Method04 {
    public static void main(String[] args) {
        int[] a = {1,8,3};
        int[] b = Arrays.copyOf(a,3);

        b[0]++;

        System.out.println("Contentt of a array: ");

        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }

        System.out.println("\nContent of b array");

        for(int i=0;i<b.length;i++){
            System.out.print(b[i] + " ");
        }
    }
}

package Theory.ArrayCopy;

//Array copy Method

/*

Parameters:
public static void arraycopy(Object src, int srcPos, Object dest,int destPos, int length)

+ src denotes the source array.
+ srcPos is the index from which copying starts.
+ dest denotes the destination array
+ destPos is the index from which the copied elements are placed in the destination array.
+ length is the length of the subarray to be copied.

 */
public class Method03 {


    public static void main(String[] args) {
        int[] a = {1,8,3};
        int[] b = new int[a.length];

        System.arraycopy(a,0,b,0,3);
        b[0]++;

        System.out.println("Content of a[]");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }

        System.out.println("\nContent of b[]");
        for(int i=0;i<b.length;i++){
            System.out.print(b[i] +" ");
        }

    }



}

package Theory.ArrayCopy;

//Clone Method

public class Method02 {
    public static void main(String[] args) {
        int a[] = {1,8,3};
        int b[] = a.clone();

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

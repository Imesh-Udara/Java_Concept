package Theory.ArrayCopy;

//Primary Method
public class Method01 {
    public static void main(String[] args) {
        int[] a = {1,8,3};
        int[] b = new int[a.length];

        for(int i=0;i<a.length;i++){
            b[i] = a[i];
        }

        b[0]++;

        System.out.println("Array a");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }

        System.out.println("\nArray b");
        for(int j=0;j<b.length;j++){
            System.out.print(b[j] + " ");
        }
    }
}

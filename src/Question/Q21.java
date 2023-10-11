package Question;

public class Q21 {
    boolean checkIFAnyEven(int arr[], int n){
        boolean flag = false;
        for(int i=0;i<n;i++){
            if(arr[i] % 2 == 0){
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void main(String args[]){
        Q21 obj = new Q21();
        int arr[] = {1,3,9,5,7};
        int n = arr.length;
        if (obj.checkIFAnyEven(arr,n)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}

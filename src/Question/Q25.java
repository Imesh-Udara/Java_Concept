package Question;

public class Q25 {
    public static void main(String[] args) {
        int[] myarr = {1,5,34,78,90};
        int sum = 0;
        int i ;
        try {
            for(i=0;i< myarr.length;i++){
                sum += myarr[i];
            }
            System.out.println("Sum: "+ sum);
        } catch (Exception e) {
            System.out.println("Some Error");
        }

    }
}

package Theory;

public class Array {
    public static void main(String[] args) {

//        double[] arrayName;
//
//        arrayName = new double[10];

        int[] age = {12,4,5,2,5};
        int sum =0;
        double average;

        for(int no: age){
            sum += no;
        }
        System.out.println(sum);
        int arrayLength = age.length;

        average = ((double) sum/(double)arrayLength);
        System.out.println("Average = " + average);

        System.out.println("Using for loop");
        for(int i=0; i < age.length; i++){
            System.out.println(age[i]);
        }

        for(int x: age){
            System.out.println(x);
        }





    }
}

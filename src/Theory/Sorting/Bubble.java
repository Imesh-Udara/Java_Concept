package Theory.Sorting;

import java.util.Arrays;

public class Bubble {
    static void bubbleSort(int array[]){
        int size = array.length;

        for(int i = 0; i < size -1; i++){
            for(int j=0; j< size-i-1;j++){
                if(array[j]> array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    // additional
    static  void evenNo(int array[]){
        int[] data = {-2,45,0,11,-9};
        int size = data.length;
        Bubble.bubbleSort(data);
        for(int i =0 ; i < size-1 ; i++){
            if(data[i]%2 ==0){
                System.out.print(data[i] + " ");
            }
        }
    }

    public static  void main(String[] args){
        int[] data = {-2,45,0,11,-9};


        Bubble.bubbleSort(data);
        Bubble.evenNo(data);

        System.out.println("Sorted Array in Ascending");
        System.out.println("printed no");
        System.out.println(Arrays.toString(data));

    }
}

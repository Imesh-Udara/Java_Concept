package Theory.Sorting;

import java.util.Arrays;

public class Selection {
    void selectionSort(int array[]){
        int size = array.length;

        for (int step = 0; step < size -1; step++){
            int min_idx = step;
            for(int i = step + 1; i < size; i++){
                if(array[i] < array[min_idx]){
                    min_idx = i;
                }
            }

            int temp = array[step];
            array[step] = array[min_idx];
            array[min_idx] = temp;
        }
    }

    public static void main(String[] args) {

        int[] data = {20, 10, 50,4,70,34};

        Selection ss = new Selection();
        ss.selectionSort(data);
        System.out.println("After the assending the order");
        System.out.println(Arrays.toString(data));

    }

}



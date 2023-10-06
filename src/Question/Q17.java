package Question;

import java.util.ArrayList;

public class Q17 {
    //Java_autoboxing
    public static void main(String[] args) {
        Integer aObj = 56;
        //unboxing
        int a = aObj;
        ArrayList<Integer> list = new ArrayList<>();

        //autoboxing
        list.add(5);
        list.add(6);

        System.out.println("ArrayList: " + list);
        //unboxing
        int c = list.get(0);
        System.out.println("Value at index 0: " + c);
    }




}

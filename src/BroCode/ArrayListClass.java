package BroCode;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList();

        food.add("pizza");
        food.add("hamburger");

        food.set(0,"shushi");
        food.remove(1);

        for(int i=0; i<food.size();i++){
            System.out.println(food.get(i));
        }
    }
}

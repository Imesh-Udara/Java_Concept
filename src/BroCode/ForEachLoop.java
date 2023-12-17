package BroCode;

import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {
//        String[] animals = {"cat","dog","cow","rat"};
        ArrayList<String> animals = new ArrayList<>();

        animals.add("dog");
        animals.add("cow");
        animals.add("snake");

        for(String i : animals){
            System.out.println(i);
        }
    }
}

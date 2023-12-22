package BroCode.sixthDay.Generics.Example_04;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        MyGenaricClass<Integer,Integer> myInt = new MyGenaricClass<>(1,9);
        MyGenaricClass<Double,Double> myDoububle = new MyGenaricClass<>(3.14,1.22);
        MyGenaricClass<Character,Character> myChar = new MyGenaricClass<>('@','$');
        MyGenaricClass<String,Character> myString = new MyGenaricClass<>("Hello",'@');

        HashMap<Integer,Integer> hashMap = new HashMap<>();//HashMap is the one of another generic class thath has two parameter

        System.out.println(myInt.getValue());
        System.out.println(myDoububle.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());
    }
}

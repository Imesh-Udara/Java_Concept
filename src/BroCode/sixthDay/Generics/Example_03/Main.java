package BroCode.sixthDay.Generics.Example_03;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        MyGenaricClass<Integer> myInt = new MyGenaricClass<>(1);
        MyGenaricClass<Double> myDoububle = new MyGenaricClass<>(3.14);
        MyGenaricClass<Character> myChar = new MyGenaricClass<>('@');
        MyGenaricClass<String> myString = new MyGenaricClass<>("Hello");

        LinkedList<Integer> linkedList = new LinkedList<>();//Linked List is the one of Generics Class It has one data type

        System.out.println(myInt.getValue());
        System.out.println(myDoububle.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());
    }
}

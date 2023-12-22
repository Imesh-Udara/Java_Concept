package BroCode.sixthDay.Generics.Example_02;

public class Main2 {
    public static void main(String[] args) {

        MyIntergerClass myInt = new MyIntergerClass(1);
        MyDoubleClass myDoububle = new MyDoubleClass(3.14);
        MyCharacterClass myChar = new MyCharacterClass('@');
        MyStringClass myString = new MyStringClass("Hello");

        System.out.println(myInt.getValue());
        System.out.println(myDoububle.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());

    }
}

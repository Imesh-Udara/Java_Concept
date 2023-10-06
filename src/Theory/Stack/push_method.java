package Theory.Stack;

import java.util.Stack;

public class push_method {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack: " + animals);
    }
}

package Theory.Stack;

import java.util.Stack;

public class pop_method {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        String element = animals.pop();
        System.out.println("Removed Elements: " + element);
        System.out.println("Stack: " + animals);
    }
}

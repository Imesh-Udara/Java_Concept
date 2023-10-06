package Theory.Map;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {

        Map<String,Integer> numbers = new java.util.HashMap<>();

        numbers.put("One", 1);
        numbers.put("Two",2);
        System.out.println("Map: "+ numbers);

        System.out.println("keys: "+ numbers.keySet());

        System.out.println("Values: "+ numbers.values());

        System.out.println("Entries"+ numbers.entrySet());

        int value = numbers.remove("Two");
        System.out.println("Removed Value: "+ value);

    }
}

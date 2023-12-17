package BroCode;

public class StringClass {
    public static void main(String[] args) {
        String name = "Bro";

//        boolean result = name.equalsIgnoreCase("bro");
//        int result = name.length();
//        char result = name.charAt(0);
//        int result = name.indexOf("o");
//        boolean result = name.isEmpty();
//        String result = name.toUpperCase();
//        String result = name.toLowerCase();
        String result = name.replace('o','L');
        System.out.println(result);


    }
}

package Theory;

public class Java_String {
    public static void main(String[] args){
        String greet = "Hello World";
        System.out.println("String: " + greet);

        int length = greet.length();
        System.out.println("Length: "+ length);

        String first = "Java";
        System.out.println("First String "+ first);

        String second = " Programming";
        System.out.println("Second String "+ second);

        String joinedString = first.concat(second);
        System.out.println("Joined String: " + joinedString);


    }
}

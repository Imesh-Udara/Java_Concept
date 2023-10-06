package Theory.ExceptionHadling;

public class Try_Catch {
    public static void main(String[] args) {
        try {
            int dividedByZero = 5/0;
            System.out.println("Rest of code in try block");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        }finally {
            System.out.println("This is the finally block");
        }
    }
}

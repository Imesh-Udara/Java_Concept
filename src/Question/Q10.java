package Question;
//Exception Handling
public class Q10 {

    public static double divideNumbers(double dividend,double divisor){
        if(divisor == 0){
            throw new ArithmeticException("Cannot divide the given number by zero!");

        }
        return dividend/divisor;
    }

    public static void main(String[] args) {
        try {
            double result = divideNumbers(5,6);
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Errors: " + e.getMessage());
        }
    }
}

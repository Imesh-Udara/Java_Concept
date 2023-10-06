package Question;

public class Q11 {

    public static void trynumber(int n){
        try {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void checkEvenNumber(int number) throws IllegalAccessException {
        if(number%2 !=0){
            throw new IllegalAccessException(number + "is odd.");
        }
    }

    public static void main(String[] args) {
        int n = 18;

    }
}

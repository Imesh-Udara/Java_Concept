package Question;

public class Q2 {

    public int addNumber(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args){
        int num1 = 35;
        int num2 = 15;

        Q2 obj = new Q2();

        int result = obj.addNumber(num1,num2);
        System.out.println("Sum is: "+ result);
        System.out.println("Square root of 4 is: "+ Math.sqrt(4));
    }

}

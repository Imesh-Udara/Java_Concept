package Question.Interview;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args){
//        int num = 29;
//        boolean flag = false;
//        for(int i=2;i <= num/2;++i){
//            if(num%i == 0){
//                flag = true;
//                break;
//            }
//        }
//        System.out.println(!flag);
//        if(!flag){
//            System.out.println("This is prime");
//        }else {
//            System.out.println("Not a prime number");
//        }
        //////////////////////////////////////////////////////////////////////////


//        int num = 29;
//        boolean flag = false;
//        for(int i=2;i<=num/2;++i){
//            if(num%i == 0){
//                flag = true;
//                break;
//            }
//        }
//        if(!flag){
//            System.out.println("Prime number");
//        }else{
//            System.out.println("Not Prime");
//        }
        int num;
        boolean IsPrime = true;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        for(int i=2;i<= num/2;i++){
            if(num%i ==0){
                IsPrime = false;
                break;
            }
        }
        if (IsPrime) {

            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime number");
        }

    }
}

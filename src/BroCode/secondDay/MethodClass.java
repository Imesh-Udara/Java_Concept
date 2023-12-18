package BroCode.secondDay;

public class MethodClass {
    public static void main(String[] args) {
        String name = "Imesh";
        int age = 26;
        int x = 10;
        int y = 30;

        hello(name,age);
        int z = sum(x,y);
        System.out.println(z);
    }

    static void hello(String yName,int yAge){
        System.out.println("Name is: " + yName);
        System.out.println("Age is: " + yAge);
    }

    static int sum (int a,int b){
        int c = a + b ;
        return c;
    }
}

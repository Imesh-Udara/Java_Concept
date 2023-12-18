package BroCode.secondDay;

public class PrintfClass {
    public static void main(String[] args) {
        System.out.printf("%d This is the new double number \n", 123 );

        boolean myBoolean = true;
        char myChar  = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;


        System.out.printf("%b \n",myBoolean);
        System.out.printf("%c\n",myChar);
        System.out.printf("%-40s\n",myString);
        System.out.printf("%d\n",myInt);
        System.out.printf("%,f\n",myDouble);
    }
}

package BroCode.forthDay.AccessModifier.Package01;

public class B {
    private String privateMessage = "This is the private";

    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.privateMessage);
    }
}

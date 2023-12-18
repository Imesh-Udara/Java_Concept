package BroCode.secondDay.OOP.OverloadedConstructor;

public class OverloadedMain {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("A","B");

        System.out.println("Here are the ingreadiants of your Cake: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sause);
        System.out.println(pizza.cheese);

    }
}

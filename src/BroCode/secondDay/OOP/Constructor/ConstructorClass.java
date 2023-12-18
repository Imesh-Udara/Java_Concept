package BroCode.secondDay.OOP.Constructor;

public class ConstructorClass {
    public static void main(String[] args) {
        Human human = new Human("Rick",65,70);
        Human human1 = new Human("Imesh",20,67);
        System.out.println(human.name);
        System.out.println(human1.name);

        human1.eat();
        human.drink();
    }
}

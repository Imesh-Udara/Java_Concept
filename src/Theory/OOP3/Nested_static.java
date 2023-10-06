package Theory.OOP3;

class Animal{
    //inner class
    class Reptile{
        public void displayInfo(){
            System.out.println("I'm a reptile");
        }
    }

    //static class
    static class Mammal{
        public void displayInfo(){
            System.out.println("I'm a mammal");
        }

//        public void eat() {
//        }
    }

    //non-static method
    public void eat(){
        System.out.println("I eat food");
    }
}
public class Nested_static {
    public static void main(String[] args) {
        Animal animal = new Animal();

        Animal.Reptile reptile = animal.new Reptile();
        reptile.displayInfo();

        Animal.Mammal mammal = new Animal.Mammal();
        mammal.displayInfo();
//        mammal.eat();
    }

}

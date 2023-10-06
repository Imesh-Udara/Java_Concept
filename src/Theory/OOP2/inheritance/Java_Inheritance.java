package Theory.OOP2.inheritance;



public class Java_Inheritance {
    public static void main(String[] args) {
        Dogs labrador = new Dogs();

        labrador.name = "Rohu";
        labrador.display();

        labrador.eat();
    }
}

class Animals{
    String name;
    public void eat(){
        System.out.println("I can eat");
    }
}

class Dogs extends Animals{
    public void display(){
        System.out.println("My name is "+ name);
    }
}

class Inheritance extends Java_Inheritance{

}
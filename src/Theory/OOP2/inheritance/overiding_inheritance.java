package Theory.OOP2.inheritance;



class Vehical{
    public void ride(){
        System.out.println("I can ride");
    }
}

class Car extends Vehical{
    @Override
    public void ride() {
        System.out.println("I ride my car");
    }

    public void bark(){
        System.out.println("I can break");
    }
}
public class overiding_inheritance {
    public static void main(String[] args) {
        Car Rangerover = new Car();

        Rangerover.ride();
        Rangerover.bark();
    }
}
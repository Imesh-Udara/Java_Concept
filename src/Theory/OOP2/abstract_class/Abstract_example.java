package Theory.OOP2.abstract_class;

abstract class MotorBike{
    abstract void brake();
}

class SportsBike extends MotorBike{
    public void brake(){
        System.out.println("SportsBike break");
    }
}

class MountainBike extends MotorBike{
    public void brake(){
        System.out.println("MountainBike break");
    }
}
public class Abstract_example {
    public static void main(String[] args) {
        MountainBike m1 = new MountainBike();
        m1.brake();
        SportsBike s1 = new SportsBike();
        s1.brake();
    }
}

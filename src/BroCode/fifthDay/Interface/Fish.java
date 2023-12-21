package BroCode.fifthDay.Interface;

public class Fish implements Prey,Predator {

    @Override
    public void hunt() {
        System.out.println("This fish hunting smaller fish");
    }

    @Override
    public void flee() {
        System.out.println("This fish feeling lager fish");
    }
}

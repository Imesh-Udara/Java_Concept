package Theory.OOP2;

class Ball{
    public void displayInfo(){
        System.out.println("I'm an animal");
    }
}

class Teniss extends Ball{
    @Override
    public void displayInfo() {
        System.out.println("I,m a Tennis ball");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        Teniss T1 = new Teniss();
        T1.displayInfo();
    }
}

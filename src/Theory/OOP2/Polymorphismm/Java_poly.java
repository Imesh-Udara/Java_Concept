package Theory.OOP2.Polymorphismm;
//Java Polymophism using the method overiding
class Language{
    public void displayinfo(){
        System.out.println("Common English Language");
    }
}

class Java extends Language{
    @Override
    public void displayinfo() {
        System.out.println("Java Progrqamming language");
    }
}
public class Java_poly {
    public static void main(String[] args) {
        Java j1 = new Java();
        j1.displayinfo();

        Language l1 = new Language();
        l1.displayinfo();
    }

}

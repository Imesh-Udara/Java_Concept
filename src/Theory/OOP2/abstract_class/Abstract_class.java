package Theory.OOP2.abstract_class;

abstract class Language{
    public void display(){
        System.out.println("This is Java Programming");
    }
}

class Main extends Language{

    public static void main(String[] args) {
        Main obj = new Main();

        obj.display();
    }
}
public class Abstract_class {

}

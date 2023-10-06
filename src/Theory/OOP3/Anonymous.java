package Theory.OOP3;

class Polygon{
    public void display(){
        System.out.println("Inside the Polygon class");
    }
}

class AnonymousDemo {
    public void createClass(){

        Polygon p1 = new Polygon(){
            public void display(){
                System.out.println("Inside an anonymous class");
            }
        };
        p1.display();
    }
}
public class Anonymous {
    public static void main(String[] args) {
        AnonymousDemo an = new AnonymousDemo();
        an.createClass();
    }
}

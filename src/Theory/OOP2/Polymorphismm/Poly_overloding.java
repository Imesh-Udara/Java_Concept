package Theory.OOP2.Polymorphismm;

class Pattern{
    public void display(){
        for (int i=0; i<10;i++){
            System.out.print("*");
        }
    }
    public void display(String symbol){
        for (int i=0; i<10;i++){
            System.out.print(symbol);
        }
    }
}
public class Poly_overloding {
    public static void main(String[] args) {
        Pattern p1 = new Pattern();

        p1.display();
        System.out.println("\n");

        p1.display("#");
    }
}

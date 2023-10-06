package Theory.OOP2.Polymorphismm;

class ProgrammingLanguage{
    public void display(){
        System.out.println("I'm Programming Language");
    }
}

class Javas extends ProgrammingLanguage{
    @Override
    public void display() {
        System.out.println("I'm Object-oriented Programming Language");
    }
}
public class Poly_Var {
    public static void main(String[] args) {
        ProgrammingLanguage p1;

        p1 = new ProgrammingLanguage();
        p1.display();

        p1 = new Javas();
        p1.display();

    }
}

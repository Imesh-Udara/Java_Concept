package Theory;

public class This_keyword {
    int instVar;
    This_keyword(int instVar){
        this.instVar = instVar;
        System.out.println("this reference = " + this);
    }

    public  static void main(String[] args){
        This_keyword obj = new This_keyword(10);
        System.out.println("Object references = " + obj);

    }
}

package Theory;

public class Java_Constructor {
    private String name;
    Java_Constructor(){
        System.out.println("Constructor Called :");
        name = "Imesh Udara";
    }
    public static void main(String[] args){

        Java_Constructor obj = new Java_Constructor();
        System.out.println("The name is "+ obj.name);
    }
}

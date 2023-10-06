package Theory;

//Private
class Data{
    private String name;
    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//Protected
class Animal{
    protected void display(){
        System.out.println("I'm an animal");
    }
}

class Dog extends Animal{
    public static void main(String[] main){
        Dog dog = new Dog();

        //access protected method
        dog.display();
    }
}

public class Java_Access_Modifiers {
    //private
//    public static void main(String[] main){
//        Data d = new Data();
//
//        //accsess the private variable using the getter and setter
//        d.setName("Imesh Udara");
//        System.out.println(d.getName());
//    }


}

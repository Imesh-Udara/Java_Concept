package BroCode.sixthDay.Generics.Example_03;

public class MyGenaricClass <T> {
    T x;

    MyGenaricClass(T x){
        this.x = x;
    }

    public T getValue(){
        return x;
    }
}

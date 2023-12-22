package BroCode.sixthDay.Generics.Example_04;

public class MyGenaricClass <T,V> {
    T x;
    V y;

    MyGenaricClass(T x,V y){

        this.x = x;
        this.y = y;
    }

    public V getValue(){

        return y;
    }
}

package BroCode.secondDay.OOP.OverloadedConstructor;

public class Pizza {
    String bread;
    String sause;
    String cheese;

    Pizza(){

    }

    Pizza (String bread){
        this.bread = bread;
    }
    Pizza (String bread,String sause){
        this.sause = sause;
        this.bread = bread;
    }
    Pizza (String bread,String sause,String cheese){
        this.cheese = cheese;
        this.bread = bread;
        this.sause = sause;
    }
}

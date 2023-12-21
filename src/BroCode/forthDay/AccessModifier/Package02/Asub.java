package BroCode.forthDay.AccessModifier.Package02;

import BroCode.forthDay.AccessModifier.Package01.*;

public class Asub extends A {



    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.defaltMessage);

        Asub asub = new Asub();
        System.out.println(asub.protectedMessage);
    }

}

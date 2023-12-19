package BroCode.thirdDay.Static;

public class Main {
    public static void main(String[] args) {

        Friend friend1 = new Friend("Sponegbob");
        Friend friend2 = new Friend("Patrick");


        System.out.println(Friend.numberOfFriends);
        Friend.displayFriends();


    }
}

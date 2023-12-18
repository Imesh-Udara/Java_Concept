package BroCode.firstDay;

public class SwitchesOfJava {
    public static void main(String[] args) {
        String day = "Sunday";

        switch (day){
            case "Sunday":
                System.out.println("Today is : " + day);
                break;
            case "Monday":
                System.out.println("Today is : " + day);
                break;
            case "Thuesday":
                System.out.println("Today is : " + day);
                break;
            case "Wendsday":
                System.out.println("Today is : " + day);
                break;
            default:
                System.out.println("This is not a day");
        }
    }
}

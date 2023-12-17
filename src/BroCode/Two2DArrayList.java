package BroCode;

import java.util.ArrayList;

public class Two2DArrayList {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();


        ArrayList<String> backeryList = new ArrayList();
        backeryList.add("pasta");
        backeryList.add("bread");
        backeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomatoes");
        produceList.add("zucchies");
        produceList.add("peppers");

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("coffee");
        drinkList.add("milk");

        groceryList.add(backeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);

        System.out.println(groceryList.get(0).get(0));
    }
}

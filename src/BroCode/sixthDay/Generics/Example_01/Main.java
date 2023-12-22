package BroCode.sixthDay.Generics.Example_01;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4};
        Double[] doubleArray = {2.3,5.6,4.4,7.8};
        Character[] characterArray = {'H','J','K','L'};
        String[] stringArray = {"B","Y","T"};

//        displayArray(intArray);
//        displayArray(doubleArray);
//        displayArray(characterArray);
//        displayArray(stringArray);
        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));

    }
    public static <T>void displayArray(T[] array){

        for(T x: array){
            System.out.println(x+" ");
        }
        System.out.println();

    }

    public static <T> T getFirst(T[] array){

        return array[0];

    }

//    public static void displayArray(Integer[] array){
//
//        for(Integer x: array){
//            System.out.println(x+" ");
//        }
//        System.out.println();
//
//    }
//
//    public static void displayArray(Double[] array){
//
//        for(Double x: array){
//            System.out.println(x+" ");
//        }
//        System.out.println();
//
//    }
//
//    public static void displayArray(Character[] array){
//
//        for(Character x: array){
//            System.out.println(x+" ");
//        }
//        System.out.println();
//
//    }
//
//    public static void displayArray(String[] array){
//
//        for(String x: array){
//            System.out.println(x+" ");
//        }
//        System.out.println();
//
//    }
}

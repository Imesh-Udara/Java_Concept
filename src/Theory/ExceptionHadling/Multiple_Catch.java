package Theory.ExceptionHadling;

class ListOfNumbers {
    public int[] arr = new int[10];

    public void writeList(){

        try {
            arr[10] = 11;
        } catch (NumberFormatException e1) {
            System.out.println("NumberFormatException => " + e1.getMessage());
        }catch (IndexOutOfBoundsException e2){
            System.out.println("IndexOutOfBoundsException => "+ e2.getMessage());
        }
    }
}
public class Multiple_Catch {

    public static void main(String[] args) {
        ListOfNumbers List = new ListOfNumbers();
        List.writeList();
    }
}

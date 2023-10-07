package Theory.I_O_stream.ByteStreamm.Inputt;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputtStream {
    public static void main(String[] args) {

        byte[] array = {1,2,3,4};

        try{
            ByteArrayInputStream input = new ByteArrayInputStream(array);

            System.out.println("The bytes read from the in put stream");

            for(int i=0;i<array.length; i++){
                //Reads the bytes
                int data = input.read();
                System.out.println(data + ", ");
            }
            input.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

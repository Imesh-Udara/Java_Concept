package Theory.I_O_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

//note
//Byte Stream
//Byte stream is used to read and write a single byte (8 bits) of data
public class Streams {
    public static void main(String[] args) {
        byte[] array = new byte[100];
        try{
            InputStream input = new FileInputStream("javaFile123.txt");
            System.out.println("Available bytes in the files: "+ input.available());

            //Read bytes from the Input stream
            input.read(array);
            System.out.println("Data read from the file");

            //Convert byte array into string
            String data = new String(array);
            System.out.println(data);

            //Close the input stream
            input.close();



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

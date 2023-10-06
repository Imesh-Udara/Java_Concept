package Theory.I_O_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class outputt {
    public static void main(String[] args) {
        String data = "This is a line of text inside the file";
        try{
            OutputStream outputStream = new FileOutputStream("javaFile123.txt");

            byte[] dataByte = data.getBytes();

            outputStream.write(dataByte);
            System.out.println("Data is written to the file");

            outputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}

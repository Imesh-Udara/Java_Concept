package Theory.I_O_stream.CharacterStreamm.Readerr;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderr {
    public static void main(String[] args) {
        char[] array = new char[100];
        try{
            //creates a render using the FileReander
            FileReader input = new FileReader("javaFile12.txt");

            //Reads Character
            input.read(array);
            System.out.println("Data in the file: ");
            System.out.println(array);

            //Closes the reader
            input.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

package Theory.I_O_stream.CharacterStreamm.Readerr;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderr {
    public static void main(String[] args) {
        char[] array = new char[100];
        try{
            FileReader file = new FileReader("javaFile12.txt");
            BufferedReader input = new BufferedReader(file);

            input.read(array);
            System.out.println("Data in the file: ");
            System.out.println(array);

            input.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

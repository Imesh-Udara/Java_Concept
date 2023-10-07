package Theory.I_O_stream.CharacterStreamm.Readerr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamRederr {
    public static void main(String[] args) {
        char[] array = new char[100];

        try {
            FileInputStream file = new FileInputStream("javaFile12.txt");
            InputStreamReader input = new InputStreamReader(file);

            input.read(array);
            System.out.println("Data in the file: ");
            System.out.println(array);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

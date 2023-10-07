package Theory.I_O_stream.CharacterStreamm.Readerr;

import java.io.IOException;
import java.io.StringReader;

public class StringReaderr {
    public static void main(String[] args) {
        String data = "This is the text read from StringReader";

        char[] array = new char[100];

        try{
            StringReader input = new StringReader(data);

            input.read();
            input.read(array);
            System.out.println("Data read from the string");
            System.out.println(array);

            input.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

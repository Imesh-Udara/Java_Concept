package Theory.I_O_stream.CharacterStreamm.Writerr;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterr {
    public static void main(String[] args) {
        String data = "This is the data in the output filee";
        try{
            FileWriter output = new FileWriter("javaFile12.txt");

            output.write(data);

            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

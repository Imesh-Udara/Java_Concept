package Theory.I_O_stream.CharacterStreamm.Writerr;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterr {


    public static void main(String[] args) {
        String data = "This is the data in the output file";
        try{
            FileWriter file = new FileWriter("javaFile12.txt");
            BufferedWriter output = new BufferedWriter(file);

            output.write(data);

            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

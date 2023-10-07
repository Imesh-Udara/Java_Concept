package Theory.I_O_stream.ByteStreamm.Outputt;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputtStream {

    public static void main(String[] args) {
        String data = "This is a line of text inside the string.";
        try{
            //Creates an output stream
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] array = data.getBytes();

            //Write data to the output stream
            out.write(array);

            String streamData = out.toString();
            System.out.println("Output stream: " + streamData);

            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}

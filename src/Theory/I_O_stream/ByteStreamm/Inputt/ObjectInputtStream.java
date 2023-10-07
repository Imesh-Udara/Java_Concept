package Theory.I_O_stream.ByteStreamm.Inputt;

import java.io.*;

public class ObjectInputtStream {
    public static void main(String[] args) {
        int data1 = 5;
        String data2 = "This is programiz";
        try{
            FileOutputStream file = new FileOutputStream("javaFile123.txt");
            ObjectOutputStream output = new ObjectOutputStream(file);

            //Writing the file using ObjectOutputStream
            output.writeInt(data1);
            output.writeObject(data2);

            FileInputStream fileStream = new FileInputStream("javaFile123.txt");
            //Creating an object input stream
            ObjectInputStream objStream = new ObjectInputStream(fileStream);

            System.out.println("Integer data : " + objStream.readInt());

            System.out.println("String data:" + objStream.readObject());

            output.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

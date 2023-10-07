package Theory.I_O_stream.ByteStreamm.Outputt;

import java.io.*;

public class ObjectOutputtStream {
    public static void main(String[] args) {
        int data1 = 5;
        String data2 = "This is programiz";

        try{
            FileOutputStream file = new FileOutputStream("javaFile123.txt");
            //create an object output stream
            ObjectOutputStream output = new ObjectOutputStream(file);

            //write objects to output stream
            output.write(data1);
            output.writeObject(data2);

            //Read data using the ObjectInputStream
            FileInputStream fileInputStream = new FileInputStream("javaFile123.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            System.out.println("Integer data :" + objectInputStream.readInt());
            System.out.println("String data: "+ objectInputStream.readObject());

            output.close();
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

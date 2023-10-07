package Theory.I_O_stream;

import java.io.File;
import java.io.IOException;

public class FileCreat {
    public static void main(String[] args) {
        try{
            File file = new File("javaFile12.txt");
            if(file.createNewFile()){
                System.out.println("New file Created");
            }else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package Theory.ExceptionHadling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Throws_Key {

    public static void firstFile() throws IOException {
        File newFile = new File("test.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }
    public static void main(String[] args) {
        try {
            firstFile();
        } catch (IOException e) {
            System.out.println(e);
        }
    }


}

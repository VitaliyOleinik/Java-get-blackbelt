package work_with_files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("/home/kardin/development/Java-get-blackbelt/files/test1.txt");
            int character;
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
            System.out.println("done");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            fileReader.close();
        }
    }
}

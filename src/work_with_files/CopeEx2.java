package work_with_files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopeEx2 {
    public static void main(String[] args) {
        try (FileInputStream inputStream
                     = new FileInputStream("/");
             FileOutputStream outputStream
                     = new FileOutputStream("/");) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
            System.out.println("The picture was copied! \nDone!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

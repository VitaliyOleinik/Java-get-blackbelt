package work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
    public static void main(String[] args) {
        try(RandomAccessFile file = new RandomAccessFile("test10.txt", "rw")) {
            int a = file.read();
            System.out.println((char) a);
            int a1 = file.read();
            System.out.println((char) a1);
            String s1 = file.readLine();
            System.out.println(s1);
            file.seek(101);
            System.out.println(file.readLine());
            long pointer = file.getFilePointer();

            file.seek(file.length() - 1);
            file.writeBytes("\n\t\t\t\t\tSuper duper author");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

package work_with_files.programmer2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {
    public static void main(String[] args) {
        List<String> employees;
        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("employees.bin")
        )) {
            employees = (ArrayList) inputStream.readObject();
            System.out.println(employees);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

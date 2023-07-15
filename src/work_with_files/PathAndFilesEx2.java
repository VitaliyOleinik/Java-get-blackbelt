package work_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesEx2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test11.txt");
        Path directoryPath = Paths.get("/home/kardin/development/Java-get-blackbelt/m");
        Path directoryPath2 = Paths.get("/home/kardin/development/Java-get-blackbelt/b");

//        Files.copy(filePath, directoryPath.resolve(filePath));
//        Files.copy(filePath, directoryPath.resolve("test16.txt"),
//                StandardCopyOption.REPLACE_EXISTING);
//        Files.copy(directoryPath2, directoryPath.resolve("b"));
//        Files.createFile(filePath);
        String dialog = "-privet \n -privet";
//        Files.write(filePath, dialog.getBytes());

        Files.readAllLines(filePath).forEach(System.out::println);
    }
}

package work_with_files;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileEx {
    public static void main(String[] args) throws IOException {
        File file = new File("test2.txt");
        File folder = new File("/home/kardin/development/Java-get-blackbelt/a");
        File folder2 = new File("/home/kardin/development/Java-get-blackbelt/b");
        File file2 = new File("/home/kardin/development/Java-get-blackbelt/b/test.txt");
        File file3 = new File("/home/kardin/development/Java-get-blackbelt/a/test1.txt");
        System.out.println("file.getAbsolutePath" + file.getAbsolutePath());
        System.out.println("folder.getAbsolutePath" + folder.getAbsolutePath());
        System.out.println("---------------------------------------");

        System.out.println("file.isAbsolute()" + file.isAbsolute());
        System.out.println("folder.isAbsolute()" + folder.isAbsolute());
        System.out.println("---------------------------------------");

        System.out.println("file.isDirectory()" + file.isDirectory());
        System.out.println("folder.isDirectory()" + folder.isDirectory());
        System.out.println("---------------------------------------");

        System.out.println("file2.exists()" + file2.exists());
        System.out.println("folder2.exists()" + folder2.exists());
        System.out.println("file.exists()" + file.exists());
        System.out.println("folder.exists()" + folder.exists());
        System.out.println("---------------------------------------");

        System.out.println("file2.createNewFile()" + file2.createNewFile());
        System.out.println("folder2.mkdir()" + folder2.mkdir());
        System.out.println("---------------------------------------");

        System.out.println("file2.length()" + file2.length());
        System.out.println("folder2.length()" + folder.length());
        System.out.println("---------------------------------------");

        System.out.println("folder2.delete()" + folder2.delete());
        System.out.println("file2.delete()" + file2.delete());
        System.out.println("---------------------------------------");

        File[] files = folder.listFiles();
        System.out.println("array of files" + Arrays.toString(files));
        System.out.println("---------------------------------------");

        System.out.println("file.isHidden()" + file.isHidden());
        System.out.println("---------------------------------------");

        System.out.println("file.isHidden()" + file3.isHidden());
        System.out.println("file.canExecute()" + file3.canExecute());
        System.out.println("file.canRead()" + file3.canRead());
        System.out.println("file.canWrite()" + file3.canWrite());
        System.out.println("---------------------------------------");

    }
}

package work_with_files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {

        String s = "Наш мир постоянно меняется и развивается. " +
                "Технологии становятся все более инновационными, " +
                "а наука открывает новые горизонты. Люди стремятся к" +
                " лучшей жизни и ищут пути для достижения успеха. " +
                "Однако, весь этот прогресс не должен заслонять нашу " +
                "способность быть добрыми и заботливыми друг к другу." +
                " Важно помнить о значимости межличностных отношений и " +
                "поддержке близких людей. Только объединившись и " +
                "поддерживая друг друга, мы сможем создать лучшее будущее " +
                "для всех.";

        try (FileWriter writer = new FileWriter("/home/kardin/development/Java-get-blackbelt/files/test1.txt", true);
             FileReader fileReader = new FileReader("/home/kardin/development/Java-get-blackbelt/files/test1.txt")) {
            for (int i = 0; i < s.length(); i++) {
                writer.write(s.charAt(i));
            }
            writer.write(s);
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

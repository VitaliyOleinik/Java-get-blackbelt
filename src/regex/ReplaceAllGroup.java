package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceAllGroup {
    static class Example1{
    public static void main(String[] args) {
        String s1 = "Privet,          moi         drug! Kak    idet     izuchenie   , Java  ?";
        System.out.println(s1);
//        s1 = s1.replace("Java", "SQL");
//        s1 = s1.replaceAll(" {2,}", " ");
//        s1 = s1.replaceAll("\\bi\\w+", "4444");
        s1 = s1.replaceFirst("\\bi\\w+", "4444");
        System.out.println(s1);
    }}

    static class Example2{
        public static void main(String[] args) {
            String myString = "12345678912345670325987;35745785912345671022122;75145648612345370819987";
            Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
            Matcher matcher = pattern.matcher(myString);
//            String myNewString = matcher
//                    .replaceAll("date: $5/$6 code: $1 $2 $3 $4 cvi: ($7)");
//            System.out.println(myNewString);

            while(matcher.find()) {
                System.out.println(matcher.group(7));
            }
        }
    }
}

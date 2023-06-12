package regex;

import java.util.regex.Pattern;

public class CheckIpAddress {

    private static void checkIp(String ip) {
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" +
                "(25[0-5]|2[0-4]\\d |[01]?\\d?\\d)";
        System.out.println(ip + " is Ok? " + Pattern.matches(regex, ip));
    }

    public static void main(String[] args) {
        // 0-255.0-255.0-255.0-255
        String ip1 = "255.38.192.99"; // ok
        String ip2 = "182.262.91.05"; // not ok
        checkIp(ip1);
        checkIp(ip2);
    }
}

package collections.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student s1 = new Student("Vitaliy", "O", 1);
        Student s2 = new Student("Karoline", "O", 1);
        Student s3 = new Student("Orkestr", "F", 1);

        map.put(s1, 7.5);
        map.put(s2, 9.5);
        map.put(s3, 9.0);

        Student st4 = new Student("Vitaliy", "O", 1);
        Student st5 = new Student("Igor", "S", 4);
        boolean result = map.containsKey(st4);
        System.out.println(result);

        for (Map.Entry<Student, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Map<Integer, String> map2 = new HashMap<>(16, 0.75f);
    }
}


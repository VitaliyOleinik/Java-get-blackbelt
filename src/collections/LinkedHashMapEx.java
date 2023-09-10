package collections;

import collections.map_interface.Student;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> lhm = new LinkedHashMap<>(16, 0.75f, true);
        Student s1 = new Student("Vitaliy", "O", 1);
        Student s2 = new Student("Puper", "O", 1);
        Student s3 = new Student("Orkestr", "F", 1);
        Student st4 = new Student("Super", "O", 1);
        Student st5 = new Student("Igor", "S", 4);
        lhm.put(4.1, s2);
        lhm.put(8.6, s3);
        lhm.put(5.8, s1);
        lhm.put(9.4, st4);
        lhm.put(6.2, st5);

        System.out.println(lhm);
        System.out.println(lhm.get(4.1));
        System.out.println(lhm.get(9.4));
        System.out.println(lhm);
    }
}

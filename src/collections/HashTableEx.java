package collections;

import collections.map_interface.Student;

import java.util.Hashtable;

public class HashTableEx {
    public static void main(String[] args) {
        Hashtable<Double, Student> ht = new Hashtable<>();
        Student s1 = new Student("Vitaliy", "O", 1);
        Student s2 = new Student("Puper", "O", 1);
        Student s3 = new Student("Orkestr", "F", 1);
        Student st4 = new Student("Super", "O", 1);
        Student st5 = new Student("Igor", "S", 4);
        ht.put(4.1, s2);
        ht.put(8.6, s3);
        ht.put(5.8, s1);
        ht.put(9.4, st4);
        ht.put(6.2, st5);
//        ht.put(6.5, null); так нельзя

        System.out.println(ht);
    }
}

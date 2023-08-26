package collections;

import collections.map_interface.Student;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Student, Double> treeMap = new TreeMap<Student, Double>();
        Student s1 = new Student("Vitaliy", "O", 1);
        Student s2 = new Student("Puper", "O", 1);
        Student s3 = new Student("Orkestr", "F", 1);
        Student st4 = new Student("Super", "O", 1);
        Student st5 = new Student("Igor", "S", 4);
        Student st6 = new Student("Igor", "S", 4);
        treeMap.put(s1, 5.8);
        treeMap.put(st4, 9.4);
        treeMap.put(s3, 8.6);
        treeMap.put(s2, 4.1);
        treeMap.put(st5, 6.2);
        treeMap.put(st6, 3.2); // значения не уникальные, а ключи уникальные

        System.out.println(treeMap); // sort asc
        System.out.println(treeMap.descendingMap()); // sort desc
//        System.out.println(treeMap.tailMap(7.3)); // больше значения выведи
//        System.out.println(treeMap.headMap(7.2)); // меньше чем значение

    }
}

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
    }
}

class Student {
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(course, student.course);
    }

    @Override
    public int hashCode() {
//        return name.length() * 7 + surname.length() * 11 + course * 53;
        return Objects.hash(name, surname, course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}

package collections.set_interface;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(4);
        linkedHashSet.add(5);
        linkedHashSet.add(6);
        linkedHashSet.add(3);
        linkedHashSet.add(0);
        System.out.println(linkedHashSet);
        linkedHashSet.remove(3);
        System.out.println(linkedHashSet);
    }
}

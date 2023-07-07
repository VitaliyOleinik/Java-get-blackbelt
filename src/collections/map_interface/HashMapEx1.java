package collections.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Vit"); // key - unique (rewrite if duplicate); null - access
        map1.put(2000, "Ivan");
        map1.put(3000, "Zan");
        map1.put(4000, "Dan");
        map1.putIfAbsent(4000, "Dan");
        System.out.println(map1);
        System.out.println(map1.containsValue("Vit"));
        System.out.println(map1.containsKey(1000));
        System.out.println(map1.keySet());
    }
}

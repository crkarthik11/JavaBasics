package _30_HashMaps.src;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        // Key and value
        // Key is unique
        // Values can be duplicate
        // Always access the value using its key

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "four");
        map.put(null, "nullvalue");
        map.remove(5);
        System.out.println(map.get(2));
        map.keySet();

        System.out.println(map.toString());

    }

}
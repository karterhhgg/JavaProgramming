package Collections;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // HashMap example
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Cherry", 3);
        System.out.println("HashMap: " + hashMap);
        System.out.println("Value for key 'Banana': " + hashMap.get("Banana"));

        // TreeMap example
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Dog", 1);
        treeMap.put("Cat", 2);
        treeMap.put("Elephant", 3);
        System.out.println("TreeMap: " + treeMap); // Keys are sorted
    }
}

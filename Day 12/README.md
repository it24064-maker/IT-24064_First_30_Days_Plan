EXAMPLE 1

import java.util.TreeMap;
public class Example1 {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Watermelon", 3);
        map.put("Lychee", 1);
        map.put("Manog", 2);
        for (String key : map.keySet()){
            System.out.println(key + " " +map.get(key));
            
        }
    }
}

EXAMPLE 2
import java.util.HashMap;
public class Example2 {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Roksana", 93);
        marks.put("Khadija", 95);
        marks.put("Mamun", 98);
        for (String name : marks.keySet()) {
            System.out.println(name + " " + marks.get(name));
        }
    }
}
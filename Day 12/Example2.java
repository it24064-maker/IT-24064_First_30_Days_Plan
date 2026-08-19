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
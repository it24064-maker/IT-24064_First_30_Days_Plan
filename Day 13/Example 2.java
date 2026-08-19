import java.util.HashMap;

public class Example2 {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Imran", 93);
        marks.put("Rakib", 95);
        marks.put("Siam", 96);

        for (String name : marks.keySet()) {
            System.out.println(name + " " + marks.get(name));
        }
    }
}
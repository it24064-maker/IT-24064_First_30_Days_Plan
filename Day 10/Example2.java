import java.util.TreeSet;

public class Example2 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Watermelon");
        set.add("Lychee");
        set.add("Mango");
        set.add("Guava");

        for (String item : set) {
            System.out.println(item);
        }
    }
}
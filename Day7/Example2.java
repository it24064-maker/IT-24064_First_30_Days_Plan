import java.util.HashMap;
import java.util.HashSet;

public class Example2 {
    public static void main(String[] args){
        HashSet <String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red");
        System.out.println("Colors : "+ colors);

        //hash map
        HashMap<String, Integer> ageMap= new HashMap<>();

        ageMap.put("Arisu", 25);

        ageMap.put("Osagi", 22);

        ageMap.put("Chisiya", 23);

        System.out.println("Age map: "+ ageMap);
        int Age= ageMap.get("Arisu");
        System.out.println("Arisu is " + Age+" years old");
    }

}
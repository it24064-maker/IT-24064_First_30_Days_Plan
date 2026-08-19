//Example1
import java.util.ArrayList;

class Product {
    int id;
    String name;

    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Example1 {
    public static void main(String[] args) {
        ArrayList<Product> cart = new ArrayList<>();

        cart.add(new Product(1, "Laptop"));
        cart.add(new Product(2, "Mouse"));
        cart.add(new Product(3, "Keyboard"));

        for (Product p : cart) {
            System.out.println(p.id + " " + p.name);
        }
    }
}



//Example2 


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
package lesson20.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Fruits {
    public static void main(String[] args) {
        List<String> fruitList = new ArrayList<>();

        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Orange");

        for (String fruit: fruitList) {
            System.out.println(fruit);
        }
    }
}

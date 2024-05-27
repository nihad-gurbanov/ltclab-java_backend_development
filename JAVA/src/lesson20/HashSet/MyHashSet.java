package lesson20.HashSet;

import java.util.Set;
import java.util.HashSet;

public class MyHashSet {
    public static void main(String[] args) {
        Set<Integer> intSet = new HashSet<>();

        intSet.add(2);
        intSet.add(15);
        intSet.add(66);
        intSet.add(2);

        for (Integer num: intSet) {
            System.out.println(num);
        }
    }
}

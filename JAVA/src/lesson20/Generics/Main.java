package lesson20.Generics;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> newPair = new Pair<>();

        newPair.setValue1(56);
        newPair.setValue2("Apple");

        System.out.println(newPair.getValue1());
        System.out.println(newPair.getValue2());
    }
}

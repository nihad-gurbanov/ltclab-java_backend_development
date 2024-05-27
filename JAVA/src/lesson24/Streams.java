package lesson24;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2, 3, 4, 5);
        List<Integer> square = number.stream().map(x -> x*x).toList();
        square.forEach(System.out::println);

        List<String> names = Arrays.asList("Reflection", "Reflection", "Collection", "Stream", "A");
        List<String> result = names.stream().filter(s -> s.length() > 3).sorted().toList();
        result.forEach(System.out::println);

        List<Integer> number1 = Arrays.asList(2,3,4,5,3);
        Set<Integer> square1 = number1
                .stream()
                .map(x->x*x)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        square1.forEach(System.out::println);


        List<String> names1 = Arrays.asList("Reflection","Collection","Stream");
        List<String> result1 = names1.stream().sorted().toList();
        result1.forEach(System.out::println);

        List<Integer> number2 = Arrays.asList(2,3,4,5,3);
        Set<Integer> square2 = number2.parallelStream().map(x->x*x).collect(Collectors.toSet());

        square2.forEach(System.out::println);
    }
}

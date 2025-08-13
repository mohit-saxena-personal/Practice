package java8;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Behavior {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,3,354,5,7,97,9);

        List<Integer> sqNumbers = mapAndCreateNewList(numbers, x -> x * x);
        List<Integer> cubeNumbers = mapAndCreateNewList(numbers, x -> x * x * x);
        List<Integer> doubleNumbers = mapAndCreateNewList(numbers, x -> x + x);
        System.out.println(doubleNumbers);
    }

    private static List<Integer> mapAndCreateNewList(List<Integer> numbers, Function<Integer, Integer> mappingFunction) {
        return numbers.stream()
                .map(mappingFunction)
                .collect(Collectors.toList());
    }
}

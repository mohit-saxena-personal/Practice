package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String> collect = listOfStrings.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        int max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
        int min = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Maximum Element : "+max);
        System.out.println("Minimum Element : "+min);

        int[] a = new int[] {4, 2, 7, 1};

        int[] b = new int[] {8, 3, 9, 5};

        int[] array = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(array));

        String s1 = "RaceCar";
        String s2 = "CarRace";

        s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

        s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        if (s1.equals(s2))
        {
            System.out.println("Two strings are anagrams");
        }
        else
        {
            System.out.println("Two strings are not anagrams");
        }
        int i = 15623;

        Integer sumOfDigits = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();
        System.out.println(sumOfDigits);

        List<Integer> listOfIntegers1 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Integer secondLargest = listOfIntegers1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondLargest);

        List<String> listOfStrings1 = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        listOfStrings1.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

    }
}

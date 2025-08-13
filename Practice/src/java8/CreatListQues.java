package java8;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class CreatListQues {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
        List<String> courses = List.of("Spring","Spring Boot","API","Microservices",
                "AWS","GCP","Docker","Kubernetes","Java");
        List<Integer> doubleNumbers = doubleList(numbers);
        System.out.println("Square of numbers: "+doubleNumbers);
        List<Integer> evenList = evenList(numbers);
        System.out.println("Even numbers"+ evenList);
        List<Integer> lengthOfTitles = findLengthOfTitles(courses);
        System.out.println("Length of course titles: "+lengthOfTitles);
    }

    private static List<Integer> findLengthOfTitles(List<String> courses) {
        return courses.stream().map(String::length)
                .collect(Collectors.toList());
    }

    private static List<Integer> evenList(List<Integer> numbers) {
        return numbers.stream().filter(number-> number%2==0)
                .collect(Collectors.toList());
    }

    private static List<Integer> doubleList(List<Integer> numbers) {
        return numbers.stream().map(number -> number*number)
                .collect(Collectors.toList());
    }
}

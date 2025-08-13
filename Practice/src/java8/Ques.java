package java8;

import java.util.Comparator;
import java.util.List;

public class Ques {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring","SpringBoot","API","Microservices",
                "AWS","GCP","Docker","Kubernetes","Java");

        courses.stream()
                .filter(i->i.contains("Spring"))
                .forEach(System.out::println);
        courses.stream()
                .filter(i->i.length()>=4)
                .forEach(System.out::println);
        courses.stream()
                .map(course->course +" "+ course.length())
                .forEach(System.out::println);
        courses.stream().sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        // sort by length of courses
        courses.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

        List<Integer> numbers = List.of(1,2,3,56,7,9,56,36,445,44);
        printSquaresOfEvenNumbers(numbers);
    }
    public static void printSquaresOfEvenNumbers(List<Integer> numbers)
    {
        numbers.stream()
                .filter(number-> number % 2 == 0)
                .map(number->number*number)
                .forEach(System.out::println);

    }
}

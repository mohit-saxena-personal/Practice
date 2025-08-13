package java8.ques;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArraysQues {
    public static void main(String[] args) {
        int[] numbers = {5,2,8,3,1};
        int[] numbers1 = {9,8,3,6,7};
        int[] numbers2 = {1,2,3,4,5,6,7,8};
        int[] arr = {2,3,10,14,20,24,30,34,40,44,50,54};
        int[] arr1 = {5,0,1,0,8,0};
        String[] strings = {"Apple","Banana","Avocado","Apricot","Grapes"};
        String str = "dabcadef";
        String str2 = "I am learning Java Streams API in Java";
        String[] str3 = {"abc","123","456","xyz"};
        String[] anagrams = {"pat","pan","tap","nap","Team","Tree","meat"};
        bringAll0toStart(arr1);
        multiply1stAndLast(numbers2);
        findAnagramPair(anagrams);
        filterIntegers(str3);
        groupNumbers(arr);
        findNumberOfVowels(str2);
        findOcuurence(str2);
        fetchSecondSmallest(numbers);
        findCommanElements(numbers,numbers1);
        reverseArrayInPlace(numbers);
        findLargestString(strings);
        removeDuplicates(str);
        seprateOutEvenAndOddNumbers(numbers2);

    }

    private static void bringAll0toStart(int[] arr1) {
     List<Integer> list = Arrays.stream(arr1).boxed().toList();
        //appoach 1
        List<Integer> zeros = list.stream().filter(i -> i == 0).collect(Collectors.toList());
        List<Integer> nonZeros = list.stream().filter(i -> i != 0).collect(Collectors.toList());
        zeros.addAll(nonZeros);
        System.out.println(zeros);
        //approach 2 using partionMap
        List<Integer> ans = list.stream()
                .collect(Collectors.partitioningBy(x->x!=0))
                .values()
                .stream().flatMap(x->x.stream()).collect(Collectors.toList());
        System.out.println(ans);
    }

    private static void multiply1stAndLast(int[] numbers2) {
        IntStream.range(0, numbers2.length/2)
                .map(x->numbers2[x]*numbers2[numbers2.length-x-1])
                .forEach(System.out::println);
    }

    private static void findAnagramPair(String[] anagrams) {
        List<String> list = Arrays.asList(anagrams);
        Collection<List<String>> ans = list.stream()
                .collect(Collectors.groupingBy(x->Arrays.stream(x.toLowerCase().split("")).sorted()
                        .collect(Collectors.toList()))).values();
        System.out.println(ans);
    }

    private static void filterIntegers(String[] str3) {
        List<String> list = Arrays.stream(str3).toList();
        List<Integer> result = list.stream().filter(string->string.matches("[0-9]+"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println(result);
    }

    private static void groupNumbers(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().toList();
        Map<Integer,List<Integer>> map = list.stream()
                .collect(Collectors.groupingBy(x->x/10*10, LinkedHashMap::new,Collectors.toList()));
        System.out.println("Groups: "+map);
    }

    private static void seprateOutEvenAndOddNumbers(int[] numbers2) {
        List<Integer> list = Arrays.stream(numbers2).boxed().toList();
        Map<Boolean,List<Integer>> map = list.stream()
                .collect(Collectors.groupingBy(x-> x%2==0,Collectors.toList()));
        System.out.println(map);
    }

    private static void findNumberOfVowels(String str2) {
        Arrays.stream(str2.split(" "))
                .filter(str->str.replaceAll("[^aeiouAEIOU]","").length()==2)
                .forEach(System.out::println);
    }

    private static void findOcuurence(String str2) {
        Map<String,Long> map = Arrays.stream(str2.split(" "))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }

    private static void removeDuplicates(String str) {
        str.chars().distinct()
                .mapToObj(x->(char)x)
                .forEach(System.out::print);
        System.out.println();
        Arrays.stream(str.split("")).distinct().forEach(System.out::print);
    }

    private static void findLargestString(String[] strings) {
        //print only length
        int length = Arrays.stream(strings).mapToInt(string->string.length()).max().orElse(0);
        System.out.println("Length of longest String is "+length);
        //print longest String
        String longestString = Arrays.stream(strings).max(Comparator.comparingInt(String::length)).orElse("null");
        System.out.println("Largest string is "+longestString);
    }

    private static void reverseArrayInPlace(int[] numbers) {
        //find mid
        IntStream.range(0,numbers.length/2).forEach(i->{
            //swap
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length -i -1];
            numbers[numbers.length -i -1] = temp;
        });
        System.out.println(Arrays.toString(numbers));
    }

    private static void findCommanElements(int[] numbers, int[] numbers1) {
        /*int[] array = Arrays.stream(numbers).filter(num -> Arrays.stream(numbers1)
                        .anyMatch(num1 -> num1 == num))
                .toArray();*/
        List<Integer> commonList = Arrays.stream(numbers).filter(num -> Arrays.stream(numbers1)
                        .anyMatch(num1 -> num1 == num))
                .boxed()
                .toList();
        System.out.println("Common Elements in given arrays are"+commonList);

    }

    private static void fetchSecondSmallest(int[] numbers) {
        int secondSmallest = Arrays.stream(numbers)
                .distinct()
                .sorted()
                .skip(1)
                .limit(1)
                .findFirst().orElseThrow();
        System.out.println("Second smallest in array: "+secondSmallest);
    }
}

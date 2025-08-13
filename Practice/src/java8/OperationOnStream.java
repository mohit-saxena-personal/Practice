package java8;

import java.util.List;

public class OperationOnStream { 
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,345,33,35,67,86,-988);
        int sum = addListStructured(numbers);
        System.out.println(sum);
        int largestNo = findLargestNumber(numbers);
        System.out.println("Largest NO: "+ largestNo);
        int minValue = findMinNumber(numbers);
        System.out.println("Min NO: "+ minValue);
        int sqSum = findSumAfterSquare(numbers);
        System.out.println("Sum of sq is: "+sqSum);
    }

    private static int findSumAfterSquare(List<Integer> numbers) {
        return numbers.stream()
                .map(i-> i*i)
                .reduce(0,Integer::sum);
    }

    private static int findMinNumber(List<Integer> numbers) {
        return numbers.stream()
                .reduce(Integer.MAX_VALUE,(x,y)-> x<y?x:y);
    }

    private static int findLargestNumber(List<Integer> numbers) {
        return numbers.stream().reduce(Integer.MIN_VALUE,(x,y)-> x>y?x:y);
    }

    private static int addListStructured(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, Integer::sum);

    }
}

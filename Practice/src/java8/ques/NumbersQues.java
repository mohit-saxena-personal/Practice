package java8.ques;

import java.util.Arrays;
import java.util.List;

public class NumbersQues {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,45,3,46,44,55,49,555);

        //print sum of all nums
        int sum = numbers.stream().reduce((a,b)->a+b).get();
        System.out.println(sum);

        //avg of all nums
        double avg = numbers.stream().mapToDouble(i->i).average().getAsDouble();
        System.out.println(avg);

        //print even and odd
        List<Integer> list = numbers.stream().filter(n->n%2==0).toList();
        System.out.println(list);

        //print nums start with 4
        List<String> list2=numbers.stream().map(nums->nums.toString()).filter(str->str.startsWith("4")).toList();
        System.out.println(list2);

        //max
        Integer max = numbers.stream().max((i,j)->i-j).get();
        System.out.println(max);

        //print nums in des
        List<Integer> desList = numbers.stream().sorted((i,j)->j-i).toList();
        System.out.println(desList);
    }
}

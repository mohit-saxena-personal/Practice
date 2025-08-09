package interview;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicatesInArray {
    public static void main(String[] args) {
        Integer[] nums = {1,2,3,2,4,5,5};
        System.out.println("Duplicates are"+findDuplicates(nums));
    }

    private static <T> Set<T> getDuplicates(T[] nums)
    {
        Set<T> seen = new HashSet<>();
        return Arrays.stream(nums).filter(num->!seen.add(num))
                .collect(Collectors.toSet());
    }
    private static List<Integer> findDuplicates(Integer[] nums) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates= new ArrayList<>();
        for(int num: nums)
        {
            if(!seen.add(num)){
                duplicates.add(num);
            }

        }
        return duplicates;
    }
}

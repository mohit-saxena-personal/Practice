package java8.ques;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentQues {
    public static void main(String[] args) {
        List<Student> stuList = Arrays.asList(new Student("Mohit",32,90),
                new Student("Rajat Sharma",32,85),
                new Student("Sharad",30,70),
                new Student("Arun",32,100),
                new Student("Ajay",30,60),
                new Student("Arun",32,99)
                );
        //group by
        Map<Integer, List<Student>> collect = stuList.stream()
                .collect(Collectors.groupingBy(student -> student.getAge()));
        System.out.println(collect);
        // group by and unique
        Map<Integer, Set<Student>> collect1 = stuList.stream()
                .collect(Collectors.groupingBy(student -> student.getAge(), Collectors.toSet()));
        System.out.println(collect1);
        // group by and unique and sort
        TreeMap<Integer, Set<Student>> collect2 = stuList.stream()
                .collect(Collectors.groupingBy(student -> student.getAge(), TreeMap::new, Collectors.toSet()));
        System.out.println(collect2);

        //fetch ages
        List<Integer> ages = stuList.stream()
                .map(map->map.getAge()).collect(Collectors.toList());
        System.out.println(ages);
        int min = ages.stream().mapToInt(x->x).summaryStatistics().getMin();
        System.out.println(min);
        //fetch all names and combine the together with comma seprated
        List<String> nameList = stuList.stream().map(emp->emp.getName())
                .sorted()
                .collect(Collectors.toList());
        String names = nameList.stream()
                .map(name->name.toUpperCase())
                .collect(Collectors.joining(",  "));
        System.out.println(names);
        //find dupliacte name
        Set<String> uniquesName = new HashSet<>();
       Set<String> duplicateNames = nameList.stream()
               .filter(name->!uniquesName.add(name))
               .collect(Collectors.toSet());
        System.out.println(duplicateNames);
        System.out.println(uniquesName);
    //find dupliates using groupby
        Map<String, Long> collect3 = nameList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect3);
        Set<String> duplicateSet = collect3.entrySet().stream().filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey()).collect(Collectors.toSet());
        System.out.println(duplicateSet);
        //dupliates using frequency
        Set<String> duplicateSet1 = nameList.stream().filter(name->Collections.frequency(nameList,name) > 1).collect(Collectors.toSet());
        System.out.println(duplicateSet1);
        //sort in desc order by marks
        List<Student> sortedMarks = stuList.stream()
                .sorted(((o1, o2) -> (int) (o2.getMarks()-o1.getMarks()))).toList();
        System.out.println(sortedMarks);
        //fetch top 3 students
        List<Student> sortedMarksTop3 = stuList.stream()
                .sorted(((o1, o2) -> (int) (o2.getMarks()-o1.getMarks())))
                .limit(3)
                .toList();
        System.out.println(sortedMarksTop3);
    }
}

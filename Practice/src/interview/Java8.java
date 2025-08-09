package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        List<Integer> list1= list.stream().filter(i->i%2!=0).collect(Collectors.toList());
        System.out.println(list1);


    }
}

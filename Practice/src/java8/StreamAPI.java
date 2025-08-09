package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamAPI {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Mohit");
        list.add("Kunal");
        list.add("Arpit");
        list.add("Suresh");
        list.add("Mamesh");

        for(String s:list)
        {
            System.out.println(s);
        }
        list.stream().forEach(s-> System.out.println(s));
        list.stream().filter(s->s.startsWith("M")).forEach(System.out::println);

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.put(5,"e");

        map.entrySet().stream().forEach(obj-> System.out.println(obj));
        map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj-> System.out.println(obj));
    }
}

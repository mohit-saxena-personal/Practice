package interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K, V> {
    private int capacity;
    public LRUCache(int capacity) {
        super(capacity,0.75f,true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest){
        return size() > capacity;
    }
    public static void main(String[] args) {
        LRUCache<String,Integer> cache = new LRUCache<>(3);
        cache.put("Mohit",90);
        cache.put("Rajat",80);
        cache.put("Arun",100);
        cache.get("Mohit");
        cache.put("Ajay",70);


        System.out.println(cache);

    }
}

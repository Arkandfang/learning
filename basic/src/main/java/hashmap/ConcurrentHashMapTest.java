package hashmap;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author fangzhou
 * @date 2022-03-28 23:11
 */
public class ConcurrentHashMapTest {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("111","111");
    }
}

package hashmap;

import java.util.HashMap;

/**
 * @author fangzhou
 * @date 2022-03-27 17:36
 */
public class HashMapTest {

    public static void main(String[] args) {
        HashMap<String, String> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("111","111");
        objectObjectHashMap.remove("111");

         String  a = "111123123asdfa阿萨德阿斯蒂芬啊发dfa1123";
        System.out.println(a.hashCode()%16);
        System.out.println(a.hashCode()&15);

        //  key.hashCode % table.lenth


    }
}

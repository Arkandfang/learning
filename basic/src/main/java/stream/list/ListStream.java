package stream.list;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author fangzhou
 * @date 2022/7/27 12:34 上午
 */
public class ListStream {


    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");

        List<Long> collect1 = stringList.stream().map(Long::valueOf).collect(Collectors.toList());
        System.out.println(collect1);

    }

    /**
     * 用流的方式删除某一个元素
     */
    private static void streamListDeleteELements() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        // 过滤不等于 1 的list
        List<Integer> collect = list.stream().filter(l -> !l.equals(1)).collect(Collectors.toList());
        System.out.println("过滤后的元素为:" + collect);
        System.out.println("原始的元素为:" + list);
    }


}

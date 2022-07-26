package stream.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author fangzhou
 * @date 2022/7/27 12:34 上午
 */
public class ListStream {


    public static void main(String[] args) {
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

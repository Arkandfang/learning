package compare;

import java.util.*;

/**
 * @author fangzhou
 * @date 2022/7/27 11:23 上午
 */
public class StringCompare {

    public static void main(String[] args) {
        // rightListMe 原始要求的类
        List<Right> rightListMe = new ArrayList<>();
        Right right = new Right();
        right.setRightId("rightId111");

        Right right1 = new Right();
        right1.setRightId("rightId222");

        Right right2 = new Right();
        right2.setRightId("rightId333");
        rightListMe.add(right);
        rightListMe.add(right1);
        rightListMe.add(right2);

        // rightListHe 特定顺序的类
        List<String> rightListHe = new ArrayList<>();
        rightListHe.add("rightId333");
        rightListHe.add("rightId111");
        rightListHe.add("rightId222");

        rightListMe.sort(new Comparator<Right>() {
            @Override
            public int compare(Right o1, Right o2) {
                int index1 = rightListHe.indexOf(o1.getRightId());
                int index2 = rightListHe.indexOf(o2.getRightId());
                return (index1 == -1 || index2 == -1) ? (index2 - index1) : (index1 - index2);
            }
        });

        for (Right s : rightListMe) {
            System.out.println(s.getRightId());
        }
    }

    private static void test() {
        String[] regulation = {"再不用过期了啊！", "已经用了用了", "不听劝过期了把？哼哼"};
        List<String> regulationList = Arrays.asList(regulation);
        String[] test = {"已经用了用了", "不听劝过期了把？哼哼", "再不用过期了啊！", "凑数的"};
        List<String> stringList = Arrays.asList(test);
        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int index1 = regulationList.indexOf(o1);
                int index2 = regulationList.indexOf(o2);
                return (index1 == -1 || index2 == -1) ? (index2 - index1) : (index1 - index2);
            }
        });
        stringList.forEach(System.out::println);
    }
}

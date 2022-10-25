package LeetCode;

/**
 * @author fangzhou
 * @date 2022-09-19 19:57
 */
public class LeetCode1342 {

    public static void main(String[] args) {
//        int i = numberOfSteps(100);
        int i = 16 & 1;
        System.out.println(i);
    }

    public int numberOfSteps(int num) {
        int count = 0;
        while (num != 0) {
            if ((num & (num - 1)) == 0) {
                double v = Math.log(num) / Math.log(2);
                return (int) v + 1 + count;
            }

            //偶数
            if ((num & 1) == 0) {
                num = num / 2;
                count++;
            }

            //奇数
            if ((num & 1) != 0) {
                num = num - 1;
                count++;
            }
        }
        return count;
    }
}

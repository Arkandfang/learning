package LeetCode;

/**
 *  移除元素
 * @author fangzhou
 * @date 2022-09-21 19:56
 */
public class LeetCodeNums2 {
    public static void main(String[] args) {
        int nums[] = {3,2, 2,3, 4};
        int i = removeElement(nums, 3);
        System.out.println(i);
    }

    public static int removeElement(int[] nums, int val) {
        int end = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val  ) {
                end++;
                continue;
            }
            nums[index] = nums[i];
            index++;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        return nums.length-end;
    }

}

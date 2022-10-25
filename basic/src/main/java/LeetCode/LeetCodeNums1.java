package LeetCode;

/**
 * https://leetcode.cn/leetbook/read/all-about-array/x9rh8e/
 *
 * @author fangzhou
 * @date 2022-09-21 16:44
 */
public class LeetCodeNums1 {


    public static void main(String[] args) {
        int nums[] = {0,2, 0, 1, 9, 2020};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int ptr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(nums,i ,ptr);
                ptr++;
            }
            if (nums[i] == 0) {
                continue;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public static void  swap(int[] nums,int i,int ptr){
        int temp = 0 ;
        temp = nums[i];
        nums[i] = nums[ptr];
        nums[ptr]=temp;
    }
}

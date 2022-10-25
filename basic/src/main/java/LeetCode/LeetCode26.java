package LeetCode;

/**
 * @author fangzhou
 * @date 2022-09-22 16:28
 */
public class LeetCode26 {
    public int removeDuplicates(int[] nums) {
        int temp = Integer.MIN_VALUE;
        int start = 0 ;
        for(int i = 0 ;i< nums.length; i ++ ){
            if(nums[i] > temp){
                temp = nums[i];
                nums[start] = temp;
                start++;
            }
        }
        return start;
    }
}

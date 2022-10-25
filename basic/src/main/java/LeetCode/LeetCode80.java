package LeetCode;


/**
 * 官方题解是使用快慢指针，我这其实使用过的也是快慢指针的思想，但是我记录了次数 可以优化 直接判位置-2是不是相同
 * @author fangzhou
 * @date 2022-09-22 17:26
 */
public class LeetCode80 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int i = removeDuplicates(nums);
        System.out.println("新数组数量为  ----"+ i);
    }


    public static int removeDuplicates(int[] nums) {
        int temp = Integer.MIN_VALUE;
        int index = 0;
        int times = 0;

        for(int i = 0;i < nums.length; i++){
            if(nums[i]!=temp){
                times = 0;
            }

            if(nums[i] >= temp && times <2 ){
                nums[index] = nums[i];
                temp = nums[i];
                index ++;
                times++;
            }
        }

        for (int i = 0; i <nums.length ; i++) {
            System.out.println(nums[i]);
        }
        return index;
    }
}

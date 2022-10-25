package LeetCode;

/**
 * @author fangzhou
 * @date 2022-09-22 18:07
 */
public class LeetCode75 {


    public static void main(String[] args) {
        int[] nums = {1,2,0};
        sortColors(nums);
    }


    public static void sortColors(int[] nums) {
        int red = 0;
        int blue = nums.length-1;
        int pointer = nums.length-1;

        for(int i = 0; i<= pointer; i++){
            if(nums[i] == 0){
                swap(red,i,nums);
                red++;
                continue;
            }

            if(nums[i] == 2){
                swap(i,blue,nums);
                blue--;
                pointer--;
                continue;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }

    public static void swap( int befre, int after,int[] nums ){
        int temp = 0;
        temp = nums[befre];
        nums[befre] = nums[after];
        nums[after] = temp;

    }
}

package LeetCode;

import java.util.Arrays;

/**
 * @author fangzhou
 * @date 2023-02-15 20:54
 */
public class LeetCode96 {

    public static void main(String[] args) {
        int i = numTrees(4);
        System.out.println(i);
    }

    public static int numTrees(int n) {
        int[] dp  = new int[n+1];
        dp[1] =1;
        dp[2]=2;

        for(int i  = 3 ; i < dp.length ; i ++){
            dp[i] = dp[i-1] + (int) Math.pow(3,i-2) ;
        }
        String s = Arrays.toString(dp);
        System.out.println(s);
        return dp[dp.length -1 ];


    }
}

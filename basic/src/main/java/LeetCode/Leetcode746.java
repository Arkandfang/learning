package LeetCode;

/**
 * @author fangzhou
 * @date 2023-02-14 23:03
 */
public class Leetcode746 {

    public static void main(String[] args) {
        int[] cost  = {1,100,1,1,1,100,1,1,100,1};
        minCostClimbingStairs(cost);
    }

    public static int minCostClimbingStairs(int[] cost) {
        // dp 数组的含义
        // 地推公式
        // dp数组初始化
        // 遍历顺序
        // 打印数组

        // dp【i】 表示爬到第i个台阶的最小花费
        // dp【i】 = min（dp[i-1] 和  dp[d-2] + min（cost【i-1】，【i-2】））
        // dp[0] = cost[0]  =  0 ; dp[1] = 0

        if(cost.length < 2){
            return 0 ;
        }
        int[] dp = new int[cost.length+1];
        for(int i = 2 ; i < cost.length+1 ;i ++){
            dp[i] = Math.min(dp[i-1] + cost[i-1],dp[i-2] + cost[i-2]) ;
        }

        for (int i = 0; i < dp.length; i++) {
            System.out.println(dp[i]);
        }
        return dp[dp.length -1 ];


    }
}

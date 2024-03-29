package LeetCode;

/**
 * @author fangzhou
 * @date 2023-02-22 00:43
 */
public class LeetCode322 {


    public static void main(String[] args) {
        int[] coins = {1,2,5};
        coinChange(coins,5);
    }
    public static int coinChange(int[] coins, int amount) {
        int max = Integer.MAX_VALUE;
        int[] dp = new int[amount + 1];
        //初始化dp数组为最大值
        for (int j = 0; j < dp.length; j++) {
            dp[j] = max;
        }
        //当金额为0时需要的硬币数目为0
        dp[0] = 0;
        for (int i = 0; i < coins.length; i++) {
            //正序遍历：完全背包每个硬币可以选择多次
            for (int j = coins[i]; j <= amount; j++) {
                //只有dp[j-coins[i]]不是初始最大值时，该位才有选择的必要
                if (dp[j - coins[i]] != max) {
                    //选择硬币数目最小的情况
                    dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
                }
            }
            for (int j = 0; j <dp.length ; j++) {
                System.out.print(dp[j] + ",");
            }
            System.out.println("//n");
        }
        return dp[amount] == max ? -1 : dp[amount];
    }
}

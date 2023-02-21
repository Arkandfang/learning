package LeetCode;

/**
 * @author fangzhou
 * @date 2023-02-13 23:16
 */
public class LeetCode502 {
    public static void main(String[] args) {
        fib(3);
    }
    public static int fib(int n) {
        // 1 确定dp数组的含义
        // 2 确定递推公式
        // 3 dp数组的初始化
        // 4 确定遍历顺序
        // 5 打印dp数组

        // 1 dp 含义  整个数组就是斐波那契 i 就是第几个
        // dp[i] = dp[i-1]+dp[i-2]
        // 前两个是 0 1 就行
        // 从前往后加么


        int[] dp  = new int[n+1];
        dp[0]= 0 ;
        dp[1]= 1;
        for(int i = 2 ;i < n ;i ++){
            dp[i] = dp[i-1]+dp[i-2];
        }

        for (int i = 0; i < dp.length; i++) {
            System.out.println(dp[i]);
        }
        return dp[dp.length-1];


    }
}

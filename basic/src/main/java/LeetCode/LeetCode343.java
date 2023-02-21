package LeetCode;

/**
 * @author fangzhou
 * @date 2023-02-15 19:27
 */
public class LeetCode343 {
    // dp【i】  拆分i个的最大乘积
    // dp[i] = Max dp[2]到dp[i-1] * (n-(i-1))

    public static void main(String[] args) {
        int i = integerBreak(6);
        System.out.println(i);
    }

    public static int integerBreak(int n) {
        int[] dp = new int[n+1];
        dp[1]=1;
        dp[2] =1;
        for (int i = 3; i < dp.length; i++) {
            int max = 0 ;
            for (int j = 1; j < i ; j++) {
                // 其实是两种，一个是dp[j]*(i-j) 多个拆分
                // 一个是 j * （i-j）
                int temp = Math.max(dp[j]*(i-j),j*(i-j));
                if (temp > max){
                    max = temp;
                }
            }
            dp[i]=max;
        }
        return dp[dp.length-1];
    }
}

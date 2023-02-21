package LeetCode;

import java.util.Arrays;

/**
 * @author fangzhou
 * @date 2023-02-15 01:21
 */
public class LeetCode63 {

    public static void main(String[] args) {
        int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
        uniquePathsWithObstacles(obstacleGrid);
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // dp[i] 的含义
        // 地推公式
        // 初始化
        // 遍历顺序
        // 打印dp 数组

        // dp[i,j] 到达第i行，j不同的种类
        // todo
        //
        // dp[i,j] = dp[i,j-1]+dp[i-1,j]
        // 初始化
        // 先从左到右，再从上到下
        //
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];
        for(int i = 0; i< m ;i++){
            if(obstacleGrid[i][0] == 1){
            }
            dp[i][0] = 1;

        }

        for(int i = 0; i< n ;i++){
            if(obstacleGrid[0][i] == 1){
                break;
            }
            dp[0][i] = 1;

        }

        for(int i = 1; i < m;i++){
            for(int j = 1 ;j <n ;j++){
                if(obstacleGrid[i][j-1]==0 && dp[i-1][j] == 0 ){
                    dp[i][j] = dp[i][j-1]+dp[i-1][j];
                }
                if(obstacleGrid[i][j-1]==0 && dp[i-1][j] == 1 ){
                    dp[i][j] = dp[i][j-1];
                }
                if(obstacleGrid[i][j-1]==1 && dp[i-1][j] == 0 ){
                    dp[i][j] = dp[i-1][j];
                }
                if(obstacleGrid[i][j-1]==1 && dp[i-1][j] == 1 ){
                    dp[i][j] = 0 ;
                }
            }
        }

        String s = Arrays.deepToString(dp);
        System.out.println(s);

        return dp[m-1][n-1];
    }
}

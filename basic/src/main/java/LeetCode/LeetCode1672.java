package LeetCode;

import java.util.ArrayList;

/**
 * @author fangzhou
 * @date 2022-09-20 20:42
 */
public class LeetCode1672 {
    public int maximumWealth(int[][] accounts) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < accounts.length; i++) {
            int sumRow = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sumRow = sumRow + accounts[i][j];
            }
            integers.add(sumRow);
        }

        int temp = 0;
        for (int i = 0; i < integers.size(); i++) {
             if (integers.get(i)>temp){
                 temp = integers.get(i);
             }
        }
        return temp;
    }
}

package main.java.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fangzhou
 * @date 2022-09-15 17:36
 */
public class LeetCode412 {


    public static void main(String[] args) {
        List<String> strings = fizzBuzz(3);
        System.out.println(strings);
    }

    public static List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");
                continue;
            }
            if (i % 3 == 0) {
                answer.add("Fizz");
                continue;
            }
            if (i % 5 == 0) {
                answer.add("Buzz");
                continue;
            }
            answer.add(String.valueOf(i));
        }
        return answer;
    }
}

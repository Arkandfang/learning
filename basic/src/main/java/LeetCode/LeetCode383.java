package main.java.LeetCode;

/**
 * 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
 * <p>
 * 如果可以，返回 true ；否则返回 false 。
 * <p>
 * magazine 中的每个字符只能在 ransomNote 中使用一次。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：ransomNote = "a", magazine = "b"
 * 输出：false
 * 示例 2：
 * <p>
 * 输入：ransomNote = "aa", magazine = "ab"
 * 输出：false
 * 示例 3：
 * <p>
 * 输入：ransomNote = "aa", magazine = "aab"
 * 输出：true
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= ransomNote.length, magazine.length <= 105
 * ransomNote 和 magazine 由小写英文字母组成
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/ransom-note
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode383 {

    public static void main(String[] args) {
        boolean b = canConstruct("aa", "aab");
        System.out.println(b);
    }

    /**
     * 第一版 自己的解法，想法是遍历他们的个数，然后一一比较，如果magazine的每一个都比ransomNote的大，那就是可以
     * 但所用的空间比官方解答要多，并且其实一共遍历了3次
     */
    public static boolean canConstruct(String ransomNote, String magazine) {
        byte[] ransomNoteChar = ransomNote.getBytes();
        byte[] magazineChar = magazine.getBytes();

        int[] ransomNoteNums = new int[26];
        int[] magazineNums = new int[26];

        count(ransomNoteChar, ransomNoteNums);
        count(magazineChar, magazineNums);


        for (int i = 0; i < ransomNoteNums.length; i++) {
            if (magazineNums[i] - ransomNoteNums[i] >= 0) {
                continue;
            }
            return false;
        }
        return true;

    }


    public static void count(byte[] chars, int[] nums) {
        for (int i = 0; i < chars.length; i++) {
            nums[chars[i] - 97] = nums[chars[i] - 97] + 1;
        }
    }


}

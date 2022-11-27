import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author fangzhou
 * @date 2022/8/15 7:33 下午
 */
public class Text1 {

    public   static char firstUniqChar(String s) {
        Queue<TreeNode> queue = new LinkedList<>();

        LinkedList<Object> objects = new LinkedList<>();
        char[] inPut = s.toCharArray();
        int[] nums = new int[26];
        for (int i = 0; i < inPut.length; i++) {
            nums[inPut[i] - 97]++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                return  (char)(i+97);
            }
        }

        return 0;


    }

    public static void main(String[] args) {
        firstUniqChar("leetcode");
//        test1111111();
        extracted();
    }

    private static void extracted() {
        String context = "有道围棋\n" +
                "有道少儿围棋\n" +
                "网易有道围棋\n" +
                "有道纵横少儿围棋\n" +
                "有道精品课围棋\n" +
                "有道纵横围棋精品课\n" +
                "有道围棋精品课柯洁\n" +
                "有道围棋网课官方网\n" +
                "有道围棋课\n" +
                "有道围棋线上课程\n" +
                "有道围棋在线启蒙课\n" +
                "有道纵横围棋\n" +
                "有道围棋课9块9元体验课\n" +
                "有道围棋网课价格表\n" +
                "网易有道少儿围棋\n" +
                "有道少儿围棋课\n" +
                "有道围棋精品课\n" +
                "网易有道围棋课app\n" +
                "网易有道围棋课程\n" +
                "有道纵横围棋课\n" +
                "网易有道围棋课\n" +
                "有道围棋试听课\n" +
                "有道围棋app下载安装\n" +
                "有道围棋体验课29\n" +
                "有道纵横围棋礼盒\n" +
                "网易有道少儿围棋课\n" +
                "网易有道纵横围棋\n" +
                "有道少儿围棋入门1-50集\n" +
                "有道围棋对弈平台\n" +
                "有道围棋精品课网课官网\n" +
                "有道围棋课一年收费\n" +
                "有道纵横在线学围棋\n" +
                "有道纵横围棋启蒙\n" +
                "围棋有道精品课\n" +
                "柯洁有道围棋课\n" +
                "网易少儿围棋\n" +
                "柯洁有道围棋\n" +
                "有道少儿围棋联系电话\n" +
                "有道少儿围棋课程";
        String lines[] = context.split("\\n");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            line.replaceAll("\r|\t", "").replace(" ", "");
            list.add(line);
        }
        StringBuilder result = new StringBuilder();
        for (String s : list) {
            result.append(s).append(",");
        }
        System.out.println(result.toString());
    }

    public static void test1111111() {
        String line = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAr+R36HCejfBkHtzz5VlJ" +
                "6Px8QamIBF+cSDD5hxkkd4hEnmy7Xr8Kdiy/5hCY/1KjLwdH4eI9pvofHB9xjJoC" +
                "hKteIZqx+kxyFVYKdMQIKN8ueEs6fB33YDQ3zmIfmhroH6sndmg1gLTQ9KaU9rzM" +
                "rXcJ+EfINPKUJMH0PADp5hvQ5RyNEIdSSc2pYWqu3L1WUhRpgYPM3jYhM8zbM/ZZ" +
                "VApbNOEXyYj9DttZ1tnQhGJwBD8iAEHq2Z1K8O0oSP1XJ3GhwW8NfHnw+3iJMKtR" +
                "ozDyXPbF8M/j8myx2+G4I3xBmsEnK9SMOdQ7oa55RF7Q0WuOBdS5d3leo5jKIM1+" +
                "bwIDAQAB";
        System.out.println(line.replaceAll("\r|\t", "").replace(" ", ""));

    }

}

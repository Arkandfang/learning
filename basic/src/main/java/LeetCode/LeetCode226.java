package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fangzhou
 * @date 2022-12-28 23:14
 */
public class LeetCode226 {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.get(0);
    }

    public TreeNode mirrorTree(TreeNode root) {
        List<TreeNode> temp = new ArrayList();
        TreeNode answer = root;
        while (root != null) {
            if (root.left != null) {
                temp.add(root.left);
            }
            if (root.right != null) {
                temp.add(root.right);
            }

            TreeNode tempNode = root.left;
            root.left = root.right;
            root.right = tempNode;
            if (temp.size() != 0) {
                root = temp.get(0);
            } else {
                root = null;
            }
        }
        return answer;
    }
}

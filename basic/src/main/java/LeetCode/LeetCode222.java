package LeetCode;

/**
 * @author fangzhou
 * @date 2023-02-07 23:47
 */
public class LeetCode222 {


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,null,null);
        int i = countNodes(root);
        System.out.println(i);
    }
    public static int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Integer count = 0;
        countNode(root, count);
        return count;

    }

    public static void countNode(TreeNode node, Integer count) {
        // 终止条件
        if (node == null) {
            return;
        }
        count++;
        countNode(node.left, count);
        countNode(node.right, count);
    }
}

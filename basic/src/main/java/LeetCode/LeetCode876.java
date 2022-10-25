package main.java.LeetCode;

/**
 * @author fangzhou
 * @date 2022-09-15 17:54
 */
public class LeetCode876 {


    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

//    public ListNode middleNode(ListNode head) {
//
//
//    }

    public static void main(String[] args) {
        int nums = 16;
        double v = Math.log(nums)/Math.log(2);
        int i = Integer.toBinaryString(nums).indexOf('1');
        System.out.println(i);
    }
}

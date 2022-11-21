package LeetCode;

/**
 * @author fangzhou
 * @date 2022-11-19 22:43
 */
public class LeetCode206 {

    public  static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public  static ListNode reverseList(ListNode head) {
        ListNode nextNode =  null;
        ListNode preview = null;
        while(head != null){
            nextNode  =  head.next  ; // 2
            head.next = preview;  // head.next = null
            preview =  head;      // pre = 1
            head = nextNode;      //
        }
        return preview ;
    }


    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNode listNode = reverseList(listNode1);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int count = 1;
        ListNode curr= head;
        ListNode dummy = new ListNode();
        ListNode prev = dummy;
        prev.next = curr;
        while(count != left){
            prev.next = curr;
            prev = curr;
            curr = curr.next;
            count++;
        }
        ListNode flag = curr;
        ListNode pre = null;
        while(count <= right){
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
            count ++;
        }
        
        prev.next = pre;
        flag.next = curr;

        return dummy.next;

    }
}
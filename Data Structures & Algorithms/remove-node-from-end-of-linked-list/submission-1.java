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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode count = head;
        int val = 0;
        while(count != null){
            count = count.next;
            val ++;
        }
        val = val - n;
        
        ListNode prev = new ListNode();
        ListNode track = prev;
        ListNode curr = head;
        while(val != 0){
            ListNode temp = curr.next;
            prev.next = curr;
            prev = curr;
            curr = curr.next;
            val --;
        }
        prev.next = curr.next;
        prev = curr.next;

        return track.next;
    }
}

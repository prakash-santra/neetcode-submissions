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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode();
        ListNode ans = temp;

        int carry = 0;

        while(l1 != null && l2 != null){
            int val = l1.val + l2.val + carry;
            carry = val / 10;
            
            temp.next = l1;
            temp = temp.next;
            temp.val = val % 10;

            l1 = l1.next;
            l2 = l2.next;

        }
        while(l1 != null){
            int val = l1.val + carry;
            carry = val / 10;
            
            temp.next = l1;
            temp = temp.next;
            temp.val = val % 10;

            l1 = l1.next;
        }
        while(l2 != null){
            int val = l2.val + carry;
            carry = val / 10;
            
            temp.next = l2;
            temp = temp.next;
            temp.val = val % 10;

            l2 = l2.next;
        }
        if(carry != 0){
            temp.next = new ListNode(carry);
            temp = temp.next;
            temp.val = carry;
        }
        return ans.next;
    }
}

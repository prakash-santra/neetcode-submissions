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
    public void reorderList(ListNode head) {
        ListNode curr = head;
        ListNode tail = head;
        
        while(curr != null && curr.next != null){
            tail = curr;
            while(tail.next.next != null){
            tail = tail.next;
        }
        if(curr == tail ){break;}
        head = curr.next;
        ListNode last = tail.next;
        tail.next = null;

        curr.next = last;
        curr = last;
        curr.next = head;
        curr = head;
        }
        }
    }


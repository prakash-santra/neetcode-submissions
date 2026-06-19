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
        
        while(tail.next != null){
            while(tail.next.next != null){
            tail = tail.next;
        }
        if(head == tail){break;}
        head = curr.next;
        curr.next = tail.next;
        curr = tail.next;
        curr.next = head;
        curr = head;
        tail.next = null;
        tail = head;
        }
        }
    }

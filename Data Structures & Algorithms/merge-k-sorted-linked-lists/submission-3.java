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
    public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists.length < 1)return null;

        ListNode ans = null;
        for(int i=0; i<lists.length; i++){
            ans = merge(ans, lists[i]);
        }
        return ans;
    }
    public ListNode merge(ListNode h1, ListNode h2){
        ListNode prev = new ListNode();
        prev.next = h1;
        ListNode temp = prev;

        while(h1 != null && h2 != null){
            if(h1.val < h2.val){
                prev.next = h1;
                prev = h1;
                h1 = h1.next;
            }
            else if(h1.val >= h2.val){
                prev.next = h2;
                prev = h2;
                h2 = h2.next;
            }
        }
        while(h1 != null){
            prev.next = h1;
                prev = h1;
                h1 = h1.next;
        }
        while(h2 != null){
             prev.next = h2;
                prev = h2;
                h2 = h2.next;
        }
        return temp.next;
    }
}

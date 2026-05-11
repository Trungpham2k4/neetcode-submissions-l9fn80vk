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
        // find start pos 
        int idx = 1;
        ListNode startPos = head;
        ListNode prevStart = null;
        while(idx < left){
            idx++;
            prevStart = startPos;
            startPos = startPos.next;
        }
        // find end pos 
        idx = 1;
        ListNode endPos = head;
        ListNode afterEnd = null;
        while(idx < right){
            idx++;
            endPos = endPos.next;
        }
        afterEnd = endPos.next;
        // reverse
        ListNode prev = afterEnd;
        ListNode curr = startPos;
        ListNode next = startPos;
        idx = left;
        while(idx <= right){
            next = next.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            idx++;
        }
        if(prevStart != null){
            prevStart.next = prev;
        }else{
            head = prev;
        }
        return head;
    }
}
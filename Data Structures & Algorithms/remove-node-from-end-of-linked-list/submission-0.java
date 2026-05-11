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
        // Intuition: Count nodes then remove;
        int count = 0;
        ListNode ptr = head;
        while(ptr != null){
            count++;
            ptr = ptr.next;
        }
        int idxDelete = count - n;
        if(idxDelete == 0){
            return head.next;
        }
        int idx = 0;
        ListNode move = head;
        while(idx < idxDelete - 1){
            move = move.next;
            idx++;
        }
        if(move.next.next == null){
            move.next = null;
        }else{
            move.next = move.next.next;
        }
        return head;
    }
}

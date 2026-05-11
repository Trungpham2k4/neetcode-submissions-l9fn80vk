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
        // Find stop point using fast-slow pointer
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode startRecursionPoint = slow.next;
        slow.next = null; // This is the last node of new list 
        ListNode prev = null;
        ListNode curr = startRecursionPoint;
        ListNode after = startRecursionPoint;
        while(curr != null){
            after = after.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        
        // Merge 2 list
        ListNode ptr1 = head;
        ListNode ptr2 = prev;
        while(ptr1 != null && ptr2 != null){
            ListNode temp = ptr1.next;
            ListNode temp2 = ptr2.next;
            ptr1.next = ptr2;
            if (temp == null) {
                break;
            }
            ptr2.next = temp;
            ptr1 = temp;
            ptr2 = temp2;
        }
    }
}

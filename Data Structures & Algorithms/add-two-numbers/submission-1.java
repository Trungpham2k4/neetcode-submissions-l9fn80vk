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

    public ListNode reverse(ListNode list){
        ListNode prev = null;
        ListNode curr = list;
        ListNode next = list;
        while(curr != null){
            next = next.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Reverse 2 list then plus
        // l1 = reverse(l1);
        // l2 = reverse(l2);
        ListNode l3 = new ListNode(0);
        ListNode ptr = l3;
        int remain = 0;
        while(l1 != null && l2 != null){
            if(l1.val + l2.val + remain >= 10){
                ptr.next = new ListNode(l1.val + l2.val + remain - 10);
                remain = 1;
                ptr = ptr.next;
            }else{
                ptr.next = new ListNode(l1.val + l2.val + remain);
                remain = 0;
                ptr = ptr.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l1 != null) {
            if (remain == 0){
                ptr.next = l1;
            }else{
                while(l1 != null){
                    if(l1.val + remain >= 10){
                        ptr.next = new ListNode(l1.val + remain - 10);
                        remain = 1;
                    }else{
                        ptr.next = new ListNode(l1.val + remain);
                        remain = 0;
                    }
                    ptr = ptr.next;
                    l1 = l1.next;
                }
            }
        }
        if(l2 != null) {
            if (remain == 0){
                ptr.next = l2;
            }else{
                while(l2 != null){
                    if(l2.val + remain >= 10){
                        ptr.next = new ListNode(l2.val + remain - 10);
                        remain = 1;
                    }else{
                        ptr.next = new ListNode(l2.val + remain);
                        remain = 0;
                    }
                    ptr = ptr.next;
                    l2 = l2.next;
                }
            }
        }
        
        if(remain > 0){
            ptr.next = new ListNode(remain);
        }
        return l3.next;
    }
}

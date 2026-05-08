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
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        HashSet<ListNode> nodes = new HashSet<>();
        ListNode ptr = head;
        while(ptr != null){
            if(!nodes.contains(ptr)){
                nodes.add(ptr);
            }else{
                return true;
            }
            ptr = ptr.next;
        }
        return false;
    }
}

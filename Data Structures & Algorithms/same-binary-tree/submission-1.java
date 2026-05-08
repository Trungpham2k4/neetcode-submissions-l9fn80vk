/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

    private boolean isSame = true;

    public void traverse(TreeNode p, TreeNode q){
        if(!isSame) return;
        if(p == null && q == null) return;
        if((p == null && q != null) || (p != null && q == null) || (p.val != q.val)){
            isSame = false;
            return;
        }
        traverse(p.left, q.left);
        traverse(p.right, q.right);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        traverse(p,q);
        return isSame;
    }
}

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

    private int maxVal;

    public int maxDepth(TreeNode root){
        if (root == null) return 0;
        int maxLeft = maxDepth(root.left);
        int maxRight = maxDepth(root.right);
        maxVal = Math.max(maxLeft + maxRight, maxVal);
        return 1 + Math.max(maxLeft, maxRight);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        maxVal = 0;
        maxDepth(root);
        return maxVal;
    }
}

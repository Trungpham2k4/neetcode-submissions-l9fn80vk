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

    private List<Integer> res;

    public void traverse(TreeNode root){
        if(root != null){
            traverse(root.left);
            res.add(root.val);
            traverse(root.right);
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        res = new ArrayList<>();
        traverse(root);
        return res;
    }
}
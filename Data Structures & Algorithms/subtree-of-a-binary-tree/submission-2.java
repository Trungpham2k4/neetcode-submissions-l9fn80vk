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
    List<TreeNode> nodes = new ArrayList<>();

    public boolean isSameTree(TreeNode tree1, TreeNode tree2){
        if(tree1 == null && tree2 == null) return true;
        if(tree1 != null && tree2 == null) return false;
        if(tree1 == null && tree2 != null) return false;
        if(tree1.val != tree2.val) return false;
        return isSameTree(tree1.left, tree2.left) && isSameTree(tree1.right, tree2.right);
    }

    public void findNode(TreeNode root, int rootVal){
        if(root!= null){
            if(root.val == rootVal){
                nodes.add(root);
            }
            findNode(root.left, rootVal);
            findNode(root.right, rootVal);
        }
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        findNode(root, subRoot.val);
        for(TreeNode node : nodes){
            if(isSameTree(node, subRoot)){
                return true;
            }
        }
        return false;
    }
}

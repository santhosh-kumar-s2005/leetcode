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
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int size=1;
        return Math.max(dfs(root.left,1),dfs(root.right,1));
    }
    public int dfs(TreeNode root ,int size){
        if(root==null) {
            return size;
        }
        return Math.max(dfs(root.left,size+1),dfs(root.right,size+1));
    }
}
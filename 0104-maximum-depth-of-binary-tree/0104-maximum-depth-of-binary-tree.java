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
        return rec(root,0,0);
    }
    public int rec(TreeNode root,int currheight,int maxheight){
        if(root==null){
            return Math.max(maxheight,currheight);
        }
        maxheight=rec(root.left,currheight+1,maxheight);
        maxheight=rec(root.right,currheight+1,maxheight);
        return maxheight;

    }
}
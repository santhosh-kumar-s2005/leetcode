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
    public boolean isBalanced(TreeNode root) {
       int res[]= rec(root,new int[]{0,1});
       if(res[1]==-1){
        return false;
       }
       return true;

    }
    public int[] rec(TreeNode root,int[] arr){
        if(root==null){
            return new int[]{1,1};
        }
        int left[]=rec(root.left,arr);
        int right[]=rec(root.right,arr);
        left[0]++;
        right[0]++;
        if(left[1]==-1 ||right[1]==-1){
            return new int[]{-1,-1};
        }
        if(Math.abs(left[0]-right[0])>1){
            return new int[]{-1,-1};
        }
        return new int[]{Math.max(left[0],right[0]),Math.min(left[1],right[1])};
       
    }
}
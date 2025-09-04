// Last updated: 9/4/2025, 12:01:32 PM
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
  
    public int goodNodes(TreeNode root) {
        return gen(root,Integer.MIN_VALUE);
    }
    public static int gen(TreeNode root,int max){
        if(root==null) return 0;
        int c=0;
        if(root.val>=max){
            c=1;
            max=root.val;
        }
        max=Math.max(max,root.val);
        c+=gen(root.left,max);
        c+=gen(root.right,max);
        return c;
    }
    
}
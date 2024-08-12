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
    int c = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        int x = cnt(root,low,high);
        return x;
    }
    public int cnt(TreeNode root,int low,int high){
        if(root == null) return c;
        if(root.val>= low && root.val<= high) c = c+ root.val;
        cnt(root.left,low,high);
        cnt(root.right,low,high);
        return c;
    }
}
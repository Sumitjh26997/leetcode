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
    int answer = 0;
    public int maxDepth(TreeNode root) {
      max_depth(root, 1);
      return answer;
    }

    public void max_depth(TreeNode root, int depth) {
        if(root == null) {
            return;
        } 
        
        if(root.left == null && root.right == null) {
            answer = Math.max(answer, depth);   
        }
        
        max_depth(root.left, depth + 1);
        max_depth(root.right, depth + 1);
    }
}
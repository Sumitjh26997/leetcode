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
    public boolean isSymmetric(TreeNode root) {
        return checkMirror(root, root);
    }

    public boolean checkMirror(TreeNode r1, TreeNode l1) {
        if(r1 == null && l1 == null) return true;
        if(r1 == null || l1 == null) return false;

        return (r1.val == l1.val) && checkMirror(r1.right, l1.left) && checkMirror(r1.left, l1.right);
    }


}
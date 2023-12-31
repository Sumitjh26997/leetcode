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
    List<Integer> traversal = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null) {
            return traversal;
        } else if (root.left == null && root.right == null) {
            traversal.add(root.val);
            return traversal;
        }

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        traversal.add(root.val);

        return traversal;
    }
}
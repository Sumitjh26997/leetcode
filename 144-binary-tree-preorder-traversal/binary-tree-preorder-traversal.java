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
    public List<Integer> traversal = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) {
            return traversal;
        } else if (root.left == null && root.right == null) {
            traversal.add(root.val);
            return traversal;
        }

        traversal.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);

        return traversal;
    }
}
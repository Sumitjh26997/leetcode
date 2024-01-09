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

    public void preOrderTraversal(TreeNode root, List<Integer> traversal) {
        if(root == null) {
            return;
        }

        if(root.left == null && root.right == null) {
            traversal.add(root.val);
        }

        preOrderTraversal(root.left, traversal);
        preOrderTraversal(root.right, traversal);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> pr1 = new ArrayList<>();
        List<Integer> pr2 = new ArrayList<>();
        preOrderTraversal(root1, pr1);
        preOrderTraversal(root2, pr2);
        
        return pr1.equals(pr2);
    }
}
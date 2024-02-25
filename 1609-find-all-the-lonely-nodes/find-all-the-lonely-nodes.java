

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
    public List<Integer> getLonelyNodes(TreeNode root) {
        List<Integer> lonely = new ArrayList<>();
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if(curr.left != null && curr.right != null) {
                queue.offer(curr.left);
                queue.offer(curr.right);
            } else if(curr.left == null && curr.right != null) {
                lonely.add(curr.right.val);
                queue.offer(curr.right);
            } else if(curr.right == null && curr.left != null) {
                lonely.add(curr.left.val);
                queue.offer(curr.left);
            }
        }

        return lonely;
    }
}
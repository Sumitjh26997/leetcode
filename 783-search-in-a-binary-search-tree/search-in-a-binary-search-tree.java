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
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode res = null;
        if(root == null) { 
            return null;
        } else if(root.val > val) {
            res = searchBST(root.left, val);
        } else if(root.val < val){
            res = searchBST(root.right, val);
        }

        System.out.println("val search : " + val);
        System.out.println("root val : " + root.val);


        if(root.val == val) {
            res = root;
            return res;
        }

        if(res != null) {
            return res;
        }
            

        return null;
    }
}
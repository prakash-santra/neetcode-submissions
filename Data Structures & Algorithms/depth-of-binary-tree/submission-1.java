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
    int val = 0, max = 0;
    public int maxDepth(TreeNode root) {
        
        if(root == null){
            max = Math.max(max, val);
            return val;
        }
        val += 1;
        maxDepth(root.left);
        maxDepth(root.right);
        val--;
        return max;
    }
}

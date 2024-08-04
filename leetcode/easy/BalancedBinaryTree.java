/*
110. Balanced Binary Tree

Given a binary tree, determine if it is height-balanced.

Note:

Given the definition of a balanced tree
we know that a tree T is not balanced if and only if there is some node
p∈T such that ∣height(p.left)−height(p.right)∣>1.

已知definition, apply in recursion function.
*/

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
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        if (Math.abs(height(root.left) - height(root.right)) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int height(TreeNode node) {
        if (node == null) return 0;
        return 1+ Math.max(height(node.left), height(node.right));
    }
}
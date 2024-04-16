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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode newNode = new TreeNode(val);
            newNode.left = root;
            return newNode;
        }
        int count_depth = 0;
        Queue<TreeNode> myQueue = new LinkedList<>();
        myQueue.offer(root);
        while (!myQueue.isEmpty()) {
            count_depth ++;
            if (count_depth == depth - 1) {
                break;
            }
            int n = myQueue.size();
            while (n > 0) {
                n--;
                TreeNode node = myQueue.poll();
                if (node.left != null) {
                    myQueue.offer(node.left);
                }
                if (node.right != null) {
                    myQueue.offer(node.right);
                }
            }
        }
        while (!myQueue.isEmpty()) {
            TreeNode node = myQueue.poll();
            TreeNode temp_node_left = node.left;
            TreeNode temp_node_right = node.right;
            node.left = new TreeNode(val);
            node.right = new TreeNode(val);
            node.left.left = temp_node_left;
            node.right.right = temp_node_right;
        }
        return root;
    }
}
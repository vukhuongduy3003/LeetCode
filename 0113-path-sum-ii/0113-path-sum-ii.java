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
    private List<List<Integer>> ans = new ArrayList<>();
    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left) + 1;
        int rightHeight = height(root.right) + 1;
        return leftHeight < rightHeight? rightHeight : leftHeight;
    }
    private void dfs(TreeNode root, int targetSum, int index, int[] arr) {
        if (root == null) {
            return;
        }
        arr[index] = root.val;
        index++;
        if (root.left == null && root.right == null && targetSum == root.val) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < index; i++) {
                list.add(arr[i]);
            }
            ans.add(list);
            return;
        }
        dfs(root.left, targetSum - root.val, index, arr);
        dfs(root.right, targetSum - root.val, index, arr);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        int h = height(root);
        int[] arr = new int[h];
        dfs(root, targetSum, 0, arr);
        return ans;
    }
}
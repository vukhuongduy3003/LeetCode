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
    public void DFS(TreeNode root, StringBuilder tmp, StringBuilder ans) {
        if (root == null) {
            return;
        }
        tmp.append((char) (root.val + 'a'));
        if (root.left == null && root.right == null) {
            StringBuilder reversedTmp = new StringBuilder(tmp).reverse();
            if (reversedTmp.compareTo(ans) < 0) {
                ans.setLength(0);
                ans.append(reversedTmp);
            }
        }
        DFS(root.left, tmp, ans);
        DFS(root.right, tmp, ans);
        tmp.deleteCharAt(tmp.length() - 1);
    }
    
    public String smallestFromLeaf(TreeNode root) {
        StringBuilder ans = new StringBuilder();
        ans.append((char) ('z' + 1));
        StringBuilder tmp = new StringBuilder();
        DFS(root, tmp, ans);
        return ans.toString();
    }
}

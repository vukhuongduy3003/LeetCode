# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def hasPathSum(self, root: Optional[TreeNode], targetSum: int) -> bool:
        def path_sum(node, targetSum):
            if not node:
                return False
            targetSum -= node.val
            if not node.left and not node.right and targetSum == 0:
                return True
            return path_sum(node.left, targetSum) or path_sum(node.right, targetSum)
        return path_sum(root, targetSum)
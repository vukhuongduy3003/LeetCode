# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        minval, maxval = min(p.val, q.val), max(p.val, q.val)
        while root:
            if minval <= root.val <= maxval:
                break

            if root.val > maxval:
                root = root.left
            else:
                root = root.right
        
        return root
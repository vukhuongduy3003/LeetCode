# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def get_result(self, root):
        if not root or (not root.left and not root.right):
            return root
        temp = root.right
        root.right = self.get_result(root.left)
        root.left = self.get_result(temp)
        return root
    
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        return self.get_result(root)    
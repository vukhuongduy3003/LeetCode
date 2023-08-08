# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def __init__(self):
        self.prev = -float('inf')
        
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        if not root:
            return True
        
        ans = True
        
        ans &= self.isValidBST(root.left)
        
        if root.val <= self.prev:
            return False
        
        self.prev = root.val
        ans &= self.isValidBST(root.right)
        
        return ans
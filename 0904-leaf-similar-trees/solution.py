# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def leafSimilar(self, root1, root2):
        """
        :type root1: TreeNode
        :type root2: TreeNode
        :rtype: bool
        """
        def rootnodelist(root,x):
            if not root:
                return None
            if root.left is None and root.right is None:
                x.append(root.val)
            else:
                rootnodelist(root.left,x)
                rootnodelist(root.right,x)
            return x
        x=[]
        y=[]
        a=rootnodelist(root1,x)
        b=rootnodelist(root2,y)
        
        return a==b
            

            

        

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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> res= new ArrayList<>();
        dfs(root,res,new StringBuilder());
        return res;

    }
    public static void dfs(TreeNode head, ArrayList<String>res,StringBuilder sb){
        if(head==null){
            return;
        }
        int len= sb.length();
        sb.append(head.val).append("->");
        if(head.left==null && head.right==null){
            res.add(sb.toString().substring(0,sb.length()-2));
            sb.setLength(len);
            return;
        }
        dfs(head.right,res,sb);
        dfs(head.left,res,sb);
        sb.setLength(len);
    }
}

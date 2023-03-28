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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer>ans=new ArrayList<>();

        postorder(ans,root);

        return ans;
    }
    void postorder(ArrayList<Integer>ans,TreeNode root){
        if(root==null){
            return;
        }
        postorder(ans,root.left);
        postorder(ans,root.right);
        ans.add(root.val);
    }
}

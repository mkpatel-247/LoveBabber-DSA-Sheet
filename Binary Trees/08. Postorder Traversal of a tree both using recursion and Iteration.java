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
/*---------- Iterative Approach ------------*/
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        TreeNode curr;

        while (!s.isEmpty()) {

            curr = s.peek();
            if (curr.left != null) {
                s.push(curr.left);
                curr.left = null;
            }
            else if (curr.right != null) {
                s.push(curr.right);
                curr.right = null;
            }
            else {
                curr = s.pop();
                res.add(curr.val);
            }
        }

        return res;
    }
}

/*---------- Recursive Approach ------------*/
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

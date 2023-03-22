//Platform LeetCode
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

/*--------------------Using Recursion Approach-------------------*/
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        return ans;
    }

    private void inorder(TreeNode root, List<Integer> ans){
        if(root == null){
            return;
        }
        
        inorder(root.left, ans);
        ans.add(root.val);
        inorder(root.right, ans);
    }
}

/*--------------------Using Iterative Approach-------------------*/
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        Stack<TreeNode> st = new Stack<TreeNode>();
        TreeNode cur = root;
        while(cur != null || !st.empty()){
            while(cur != null){
                st.add(cur);
                cur = cur.left;
            }
            cur = st.pop();
            ans.add(cur.val);
            cur = cur.right;
        }

        return ans;
    }
}

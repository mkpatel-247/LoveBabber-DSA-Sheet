/*class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}*/

class Solution {
    // Function to return the diameter of a Binary Tree.
    int ans = 0;
    int diameter(Node root) {
        // Your code here
        int myHeight = height(root);
        return ans;
    }
    private int height(Node root){
        if(root == null){
            return 0;
        }
        
        int left = height(root.left);
        int right = height(root.right);
        ans = Math.max(ans, 1+left+right);
        return Math.max(left,right)+1;
    }
}

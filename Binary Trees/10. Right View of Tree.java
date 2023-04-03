/*Complete The Function Provided
Given Below is The Node Of Tree
class Node
{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
         left = right = null;
    }
}*/


class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> res = new ArrayList<>();
    ArrayList<Integer> rightView(Node node) {
        //add code here.
        solve(node, 0);
        return res;
    }
    
    public void solve(Node root, int level){
        if(root == null){
            return;
        }
        
        if(level == res.size()){
            res.add(root.data);
        }
        
        solve(root.right, level+1);
        solve(root.left, level+1);
    }
}


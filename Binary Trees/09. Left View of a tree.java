/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> res = new ArrayList<>();
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      solve(root, 0);
      return res;    
    }
  
    private void solve(Node root, int level){
        if(root==null) 
            return;
      
        if(level==res.size()) 
            res.add(root.data);
        solve(root.left, level+1);
        solve(root.right, level+1);

    }
}

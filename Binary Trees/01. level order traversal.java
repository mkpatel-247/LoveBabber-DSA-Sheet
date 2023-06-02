//Level Order Traversal
class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        if(node == null){
            return null;
        }
        
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        q.add(node);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                if(q.isEmpty())
                    break;
                else
                    q.add(null);
            }
            else{
                arr.add(currNode.data);
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
        return arr;
    }
}

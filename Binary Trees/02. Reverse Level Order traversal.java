class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
        if(node == null){
            return null;
        }
        
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        
        q.add(node);
        
        while(!q.isEmpty()){
            Node currNode = q.remove();
            
            arr.add(currNode.data);
            if(currNode.right != null){
                q.add(currNode.right);
            }
            if(currNode.left != null){
                q.add(currNode.left);
            }
        }
        Collections.reverse(arr);
        return arr;
    }
}

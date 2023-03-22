/* class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}*/

class Solution {
    //Function to find first node if the linked list has a loop.
    public static int findFirstNode(Node head){
        //code here
        
        HashSet<Node> hs = new HashSet<>();
        Node dummy = head;
        hs.add(dummy);
        
        while(dummy != null){
            if(!hs.contains(dummy.next)){
                dummy = dummy.next;
                hs.add(dummy);
            } else {
                return dummy.next.data;
            }
        }
        return -1;
    }
}

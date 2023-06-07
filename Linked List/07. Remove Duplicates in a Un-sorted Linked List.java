/* LinkedList Structure
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}
*/

class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
        if(head == null) return null;
        
        HashSet<Integer> hs = new HashSet<>();
        Node curr = head;
        Node prev = null;
        
        while(curr != null){
            if(hs.contains(curr.data)){
                prev.next = curr.next;
            }else{
                hs.add(curr.data);
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }
}

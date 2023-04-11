/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	    // Your code here
        
        Node fast = head;
        while(fast!=null && fast.next != null){
            if(fast.data == fast.next.data){
                fast.next = fast.next.next;
            }
            else{
                fast = fast.next;
            }
        }
        return head;
    }
}

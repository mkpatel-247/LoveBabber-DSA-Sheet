/*
class Node
{
    int data;
    Node next;
}
*/

class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        if(head==null){
            return;
        }
        // code here
        HashSet<Node> arr = new HashSet<>();
        Node start = head;
        arr.add(start);
        
        while(start != null){
            if(!arr.contains(start.next)){
                start = start.next;
                arr.add(start);
            } else {
                start.next = null;
                start = start.next;
            }
        }
    }
}

//function Template for Java

/* linked list node class:
class Node {
    int value;
    Node next;
    Node(int value) {
        this.value = value;
    }
}
*/

//Iterative Reverse a Linked List
class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        Node preNode = null;
        Node currNode = head;
        
        while(currNode != null){
            Node temp = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = temp;
        }
        return preNode;
    }
}

//Recursive Reverse a Linked List

/* linked list node class:
class Node {
    int value;
    Node next;
    Node(int value) {
        this.value = value;
    }
}
*/

class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        if(head == null || head.next == null){
            return head;
        }
        
        Node newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}

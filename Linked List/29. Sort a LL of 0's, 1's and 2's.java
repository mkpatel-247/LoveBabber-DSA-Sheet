/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        int one=0,zero=0,two=0;
        Node headCount = head;
        while(headCount!=null){
            if(headCount.data == 0){
                zero++;
            }else if(headCount.data == 1){
                one++;
            }else if(headCount.data == 2){
                two++;
            }
            headCount = headCount.next;
        }
        Node newHead = head;
        for(int i=1; i<=zero; i++){
            newHead.data = 0;
            newHead = newHead.next;
        }
        for(int i=1; i<=one;i++){
            newHead.data = 1;
            newHead = newHead.next;
        }
        for(int i=1; i<=two; i++){
            newHead.data = 2;
            newHead = newHead.next;
        }

        return head;
    }
}

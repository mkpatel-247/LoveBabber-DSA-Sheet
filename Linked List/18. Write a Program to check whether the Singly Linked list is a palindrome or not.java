class Solution {
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        // Your code here
        Stack<Integer> st = new Stack<Integer>();
        Node copy = head;
        
        while(copy!=null){
            st.push(copy.data);
            copy = copy.next;
        }
        
        while(head != null){
            if(head.data != st.pop())
                return false;
            head = head.next;
        }
        return true;
    }
}

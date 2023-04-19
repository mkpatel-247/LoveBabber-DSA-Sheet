class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> st = new Stack<>();
        for(int i=0; i<x.length(); i++){
            char b = x.charAt(i);
            if(b=='(' || b=='{' || b=='['){
                st.push(b);
                continue;
            }
            if(st.isEmpty()){
                return false;
            }
            else{
                char ch = st.peek();
                if((ch=='(' && b==')') || (ch=='[' && b==']') || (ch=='{' && b=='}')){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}

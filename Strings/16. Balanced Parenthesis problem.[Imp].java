class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> st = new Stack<>();
        for(int i=0; i<x.length(); i++){
            char b = x.charAt(i);
            if(x.charAt(i) == '{' || x.charAt(i) == '[' || x.charAt(i) == '('){
                st.push(b);
            } else{
                if(st.isEmpty()){
                    return false;
                }
                else{
                    char t = st.peek();
                    if((t=='(' && b ==')') || (t=='{' && b =='}') || (t=='[' && b ==']')){
                        st.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }
}

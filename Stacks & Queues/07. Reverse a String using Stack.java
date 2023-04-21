class Solution {
    
    public String reverse(String S){
        //code here
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<S.length(); i++){
            st.push(S.charAt(i));
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }

}

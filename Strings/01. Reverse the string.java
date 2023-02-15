// Question Link: https://leetcode.com/problems/reverse-string/
// Reverse the String

class Solution {
    public void reverseString(char[] s) {
        
        char[] duplicateArray = new char[s.length];
        for(int i = 0; i < s.length; i++){
            duplicateArray[i] = s[i];
        }
        int j = 0;
        for(int i = s.length-1; i >= 0; i--){
            s[j] = duplicateArray[i];
            j++;
        }
    }
}

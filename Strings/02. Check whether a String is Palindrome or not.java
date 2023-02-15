// Question Link: https://practice.geeksforgeeks.org/problems/palindrome-string0817/1
// Check whether a String is Palindrome or not

class Solution {
    int isPalindrome(String S) {
        // code here
        int result = 0;
        String temp="";
        for(int i = S.length()-1; i >= 0; i--){
            temp+=S.charAt(i);
        }
        // System.out.print(S == temp);
        if(S.equals(temp)){
            result = 1;
        }else{
            result = 0;
        }
        return result;
    }
}

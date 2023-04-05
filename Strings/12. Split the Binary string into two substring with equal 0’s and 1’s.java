class Solution {
    public static int maxSubStr(String str) {
       //Write your code here
       int pair = 0, zeroCnt=0, oneCnt=0;
       for(int i=0; i<str.length(); i++){
           if(str.charAt(i) == '0'){
               zeroCnt++;
           }
           else if(str.charAt(i) == '1'){
               oneCnt++;
           }
           if(zeroCnt==oneCnt)
                pair++;
       }
       if(zeroCnt == oneCnt){
           return pair;
       }
       return -1;
    }
}

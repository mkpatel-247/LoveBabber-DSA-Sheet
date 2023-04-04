class Solution {
    static int setBits(int N) {
        // code here
        String str = Integer.toBinaryString(N);
        int cnt=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '1')
                cnt++;
        }
        return cnt;
    }
}

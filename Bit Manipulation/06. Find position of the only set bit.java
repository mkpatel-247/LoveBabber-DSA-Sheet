class Solution {
    static int findPosition(int N) {
        // code here
        String bit = Integer.toBinaryString(N);
        int cnt=0, pos = 0;
        for(int i=0; i<bit.length(); i++){
            if(bit.charAt(i) == '1'){
                cnt++;
                pos = bit.length() - i;
            }
            if(cnt>=2){
                return -1;
            }
        }
        if(cnt==1){
            return pos;
        }
        return -1;
    }
};

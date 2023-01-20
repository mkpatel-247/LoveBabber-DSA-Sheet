class Solution {
    static int countSquares(int N) {
        // code here
        int perfectSquareCount = 0;
        for(int i = 1; i < N; i++){
            if((i*i) >= N){
                return perfectSquareCount;    
            }
            perfectSquareCount++;
        }
        return 0;
    }
}

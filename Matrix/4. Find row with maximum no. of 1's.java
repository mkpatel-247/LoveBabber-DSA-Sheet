class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int ans = 0, row = -1;
        for(int i = 0; i < n; i++){
            int maxCount = 0;
            for(int j = 0; j < m; j++){
                if(arr[i][j] == 1){
                    maxCount++;
                }
            }
            if(maxCount > ans){
                ans = maxCount;
                row = i;
            }
        }
        return row;
    }
}

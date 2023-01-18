class Solution {
    int median(int matrix[][], int R, int C) {
        // code here
        int[] a = new int[R*C];
        
        int idx = 0;
        for(int i = 0; i < R; i++){
            for(int j = 0; j < C; j++){
                a[idx] = matrix[i][j];
                idx++;
            }
        }
        
        Arrays.sort(a);
        int n = a.length/2;
        return a[n];
    }
}

// User function Template for Java

class Solution {
    int[][] sortedMatrix(int N, int Mat[][]) {
        // code here
        int[] arr = new int[N*N];
        int k = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                arr[k++] = Mat[i][j];
            }
        }
        Arrays.sort(arr);
        k = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                Mat[i][j] = arr[k++];
            }
        }
        return Mat;
    }
};

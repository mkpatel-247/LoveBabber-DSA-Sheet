//Find the "Kth" max and min element of an array 

// Part - 1
//Largest K element
class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        int[] arrK = new int[k];
        
        for(int i = 0; i < k; i++){
            int index = i;
            for(int j = i+1; j < n; j++){
                if(arr[index] < arr[j]){
                    index = j;                    
                }
            }    
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
            arrK[i] = arr[i];
        }
        // for(int i=0; i < k;i++){
        //     arrK[i] = arr[i];
        // }
        return arrK;
    }
}

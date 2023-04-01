class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long max = Integer.MIN_VALUE;
        long res = 0;
        for(int el : arr){
            res += el;
            if(res > max){
                max = res;
            }
            if(res < 0){
                res = 0;
            }
        }
        return max;
    }
    
}

//Problem Link https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1

class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long max = Integer.MIN_VALUE;
        long ans = 0;
        for(int a : arr){
            ans += a;
            if(ans > max){
                max = ans;
            }
            if(ans < 0){
                ans = 0;
            }
        }
      
        return max;
    }
    
}

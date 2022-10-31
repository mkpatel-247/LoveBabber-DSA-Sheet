// Problem Link: https://practice.geeksforgeeks.org/problems/union-of-two-arrays/0
// Move all the negative elements to one side of the array 

class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        int[] duplicateArray = new int[n];
        
        for(int i = 0; i < n; i++){
            duplicateArray[i] = arr[i];
        }
        
        int j = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                arr[j] = arr[i];
                j++;
            }
        }
        for(int i = 0; i < n; i++){
            if(duplicateArray[i] <= 0){
                arr[j] = duplicateArray[i];
                j++;
            }
        }
    }
}

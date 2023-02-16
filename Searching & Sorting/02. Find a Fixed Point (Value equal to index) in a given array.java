//Question Link: https://practice.geeksforgeeks.org/problems/value-equal-to-index-value1330/1
//Find value similar to Index

class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(arr[i] == i+1){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}

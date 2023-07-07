//Problem Link: https://leetcode.com/problems/merge-sorted-array/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(j>=0){
            if(i>=0 && nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}

// GFG Problem Link: https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1
class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        int l = n-1;
        int r = 0;
        
        while(l >= 0 && r < m){
            if(arr1[l] > arr2[r]){
                long swap = arr1[l];
                arr1[l] = arr2[r];
                arr2[r] = swap;
                l--;
                r++;
            }else{
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}


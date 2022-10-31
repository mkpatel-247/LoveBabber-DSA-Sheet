// Problem Link: https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
// Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo 

class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here
        int z = 0, o = 0, t = 0;
        int i = 0;
        while(i < n){
            if(a[i] == 0){
                z++;
            }else if(a[i] == 1){
                o++;
            }else if(a[i] == 2){
                t++;
            }
            i++;
        }
        i = 0;
        int j = 0;
        while(j < z){
            a[i] = 0;
            i++;
            j++;
        }
        j = 0;
        while(j < o){
            a[i] = 1;
            i++;
            j++;
        }
        j =0;
        while(j < t){
            a[i] = 2;
            i++;
            j++;
        }
    }
}

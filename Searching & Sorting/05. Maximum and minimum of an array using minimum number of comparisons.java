class Solution{
    int middle(int A, int B, int C){
        //code here
        int[] arr = new int[]{A, B, C};
        Arrays.sort(arr);
        return arr[arr.length/2];
    }
}

class Solution
{
    public boolean findPair(int arr[], int size, int n)
    {
        //code here.
        int cnt = 0;
        Arrays.sort(arr);
        for(int i = 0; i < size; i++){
            for(int j = size-1; j > 0; j--){
                int diff = arr[j] - arr[i];
                if(diff == n && i!=j)
                    cnt++;
                else if(diff < n) break;
            }
        }
        if(cnt > 0) return true;
        return false;
    }
}

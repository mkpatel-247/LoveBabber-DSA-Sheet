class Solution
{
    long countTriplets(long arr[], int n,int sum)
    {
        long count=0;

        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int s=i+1;
            int e=n-1;
            while(s<e){
                if(arr[i]+arr[s]+arr[e]>=sum){
                      e--;
                }
                else{
                    count=count+e-s;
                    s++;
                }
            }
        }

        return count;
    }
}

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        long ans = Integer.MAX_VALUE;
        Collections.sort(a);
        for(int i=0; i<=n-m; i++){
           int st = a.get(i);
           int end = a.get(i+m-1);
           int gap = end - st;
           ans = Math.min(gap, ans);
        }
        return ans;
    }
}

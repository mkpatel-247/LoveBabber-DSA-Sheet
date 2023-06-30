
class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        int s=0;
        HashMap<Integer, Integer> hs = new HashMap<>();
        
        for(int i=0; i<n; i++){
            s = s + arr[i];
            if(s==0 || hs.containsKey(s) || arr[i] == 0){
                return true;
            } else {
                hs.put(s, 1);
            }
        }
        
        return false;
    }
}

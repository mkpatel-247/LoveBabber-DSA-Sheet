//Boyer-Moore Majority Voting Algorithm
class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        int cnt = 0;
        int el = 0;
        for(int n : a){
            if(cnt == 0)
                el = n;
            if(n == el)
                cnt++;
            else
                cnt--;
        }
        
        cnt = 0;
        for(int n : a){
            if(el == n){
                cnt++;
            }
        }
        if(cnt > size/2) 
          return el;
        else 
          return -1;
    }
}

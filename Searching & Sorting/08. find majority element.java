//Boyer-Moore Majority Voting Algorithm
class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        int count = 0;
        int el = 0;
        for(int n : a){
            if(count == 0)
                el = n;
            if(n == el)
                count++;
            else
                count--;
        }
        
        count = 0;
        for(int n : a){
            if(el == n){
                count++;
            }
        }
        if(count > size/2) 
          return el;
        else 
          return -1;
    }
}

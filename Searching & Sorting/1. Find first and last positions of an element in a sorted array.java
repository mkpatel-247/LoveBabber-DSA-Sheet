//Find first and last position of element in array
class GFG
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        ArrayList<Long> res = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            if(arr[i] == x){
                Long idx = Long.valueOf(i);
                res.add(idx); //Adding start index to arraylist
                int j = 1;
                while((i+j) != n && arr[i+j] == x){
                    idx = Long.valueOf(i+j); // If there are other same element in array than idx value will updated
                    j++;
                }
                res.add(idx);//Adding end Index to arraylist.
            }
        }
        //If x value is not present in array the -1 will added.
        res.add(-1L);  res.add(-1L);
        return res;
    }
}

class Complete{
    
   
    // Function for finding maximum and value pair
    public static int search (int arr[], int n, int x, int k) {
        //Complete the function
        for(int i=0;i<n;i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    
    
}

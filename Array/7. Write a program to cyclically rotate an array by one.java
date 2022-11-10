class Compute {    
    public void rotate(int arr[], int n)
    {
        for(int i = 0; i < n; i++){
            int temp = arr[i];
            arr[i] = arr[n-1];
            arr[n-1] = temp;
        }
    }
}

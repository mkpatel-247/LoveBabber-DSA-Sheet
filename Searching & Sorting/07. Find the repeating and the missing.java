class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int[] newArr = new int[n+1];
        int repeat = 0, missing = 0;
        int idx = 0;
        for(int i = 0; i < n; i++){
            newArr[arr[i]]++;
        }
        for(int i = 1; i < newArr.length; i++){
            if(newArr[i] == 2){
                repeat = i;
            }
            if(newArr[i] == 0){
                missing = i;
            }
        }
        return new int[]{repeat, missing};
    }
}

//Spiral traversal on a Matrix

class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> res = new ArrayList<>();
        int left = 0, right = c-1, top = 0, bottom = r-1;
      
        while(top <= bottom && left <= right){
            for(int i = left; i <= right;i++){
                res.add(matrix[left][i]);
            }
            top++;
            for(int i = top; i <= bottom; i++){
                res.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}

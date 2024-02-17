class Solution {
    public int[][] generateMatrix(int n) {
    int[][] matrix = new int[n][n];
      int top =0; 
      int bottom = n-1;
      int left = 0;
      int right = n-1;
      int num = 1;
      while(left<=right && top<=bottom){
          for(int i=left; i<=right; i++){
             matrix[top][i]=num++;
          }
          top++;
          for(int j=top; j<=bottom; j++){
            matrix[j][right]= num++;
          }
          right--;
          if(top<=bottom){
              for(int i=right; i>=left; i--){
                  matrix[bottom][i]= num++;
              }
              bottom--;
          }
          if(left<=right){
             for(int i=bottom; i>=top; i--){
                matrix[i][left] = num++;
             }
             left++;
          }
      }
      return matrix;
    }
}
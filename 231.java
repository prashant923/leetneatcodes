class Solution {
    public boolean isPowerOfTwo(int n) {
        if( n==1){
            return true;
        }
        if(n<0){
            return false;
        }
        int temp = 1;
        for(int i=0; i<=31; i++){
          if(n==temp){
              return true;
          }
          temp *= 2;
        }
        return false;
    }
}
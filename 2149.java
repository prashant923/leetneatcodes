class Solution {
    public int[] rearrangeArray(int[] nums) {
        int result[]= new int[nums.length];
        int i = 0;
            int k = 1;
        for(int num: nums){
            
            if(num>0){
                result[i]= num;
                i = i+2;
            }
            else if(num< 0){
                result[k]= num;
                k= k+2;
            }
        }
        return result;
    }
}
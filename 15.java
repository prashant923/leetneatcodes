import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++) {
            if(i == 0 || nums[i] != nums[i - 1]) {
                int num1 = nums[i];
                int left = i + 1, right = nums.length - 1;
                while(left < right) {
                    int sum = num1 + nums[left] + nums[right];
                    if(sum == 0) {
                        result.add(Arrays.asList(num1, nums[left], nums[right]));
                        while(left < right && nums[left] == nums[left + 1]) left++;
                        while(left < right && nums[right] == nums[right - 1]) right--;
                        left++;
                        right--;
                    } else if(sum < 0) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}

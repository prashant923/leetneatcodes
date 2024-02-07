import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> innerList1 = new ArrayList<>();
        List<Integer> innerList2 = new ArrayList<>();

        for (int num : nums1) {
            if (!contains(nums2, num) && !innerList1.contains(num)) {
                innerList1.add(num);
            }
        }

        for (int num : nums2) {
            if (!contains(nums1, num) && !innerList2.contains(num)) {
                innerList2.add(num);
            }
        }

        result.add(innerList1);
        result.add(innerList2);
        return result;
    }

    private boolean contains(int[] nums, int target) {
        int count = 0;
        for (int num : nums) {
            if (num == target) {
                count++;
            }
        }
        return count > 0;
    }
}

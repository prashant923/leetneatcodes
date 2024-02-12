import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        List<Integer> remaining = new ArrayList<>();
        for (int num : nums) {
            remaining.add(num);
        }
        permuteHelper(result, current, remaining);
        return result;
    }
    
    private void permuteHelper(List<List<Integer>> result, List<Integer> current, List<Integer> remaining) {
        if (remaining.isEmpty()) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < remaining.size(); i++) {
            int num = remaining.get(i);
            current.add(num);
            remaining.remove(i);
            permuteHelper(result, current, remaining);
            current.remove(current.size() - 1);
            remaining.add(i, num);
        }
    }
}

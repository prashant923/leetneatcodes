class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1; // Initialize max to -1 for the last element
        for (int i = arr.length - 1; i >= 0; i--) { // Iterate from right to left
            int temp = arr[i]; // Store current element
            arr[i] = max; // Replace current element with max on its right
            max = Math.max(max, temp); // Update max
        }
        return arr;
    }
}

class Solution {
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        // pura array reverse kiya
        reverse(nums, 0, n - 1);
        // k elements reverse kiya
        reverse(nums, 0, k-1);
        // bacche hue elements reverse kiye
        reverse(nums, k, n - 1);
    }
}

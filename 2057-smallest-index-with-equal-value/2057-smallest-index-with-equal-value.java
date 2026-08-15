class Solution {
    public int smallestEqual(int[] nums) {
        int n = nums.length;
        int i = 0;
        int min = i;
        for (i = 0; i < n; i++) {
            if (i % 10 == nums[i]) {
                min = Math.min(min, i);
                return i;
            }
        }
        return -1;
    }
}
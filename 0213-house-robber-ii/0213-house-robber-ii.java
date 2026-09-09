class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        
        int choice1 = robLinear(nums, 0, nums.length - 2);
        int choice2 = robLinear(nums, 1, nums.length - 1);
        
        return Math.max(choice1, choice2);
    }
    private int robLinear(int[] nums, int start, int end) {
        int a = 0; 
        int b = 0; 
        
        for (int i = start; i <= end; i++) {
            int temp = Math.max(b, a + nums[i]);
            a = b;
            b = temp;
        }
        
        return b;
    }
}

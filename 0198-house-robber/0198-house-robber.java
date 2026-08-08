class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int r1 = 0;
        int r2 = 0;
        
        for (int money : nums) {
            int currentMax = Math.max(r1, r2 + money);
            r2 = r1;
            r1 = currentMax;
        }
        
        return r1;
    }
}
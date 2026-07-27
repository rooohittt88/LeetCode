class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int max=nums[n-1];
        int sec_max=nums[n-2];
        return (max-1)*(sec_max-1);
    }
}
class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<3){
            return -1;
        }
        Arrays.sort(nums);
        int ans=nums[1];
        return ans;

    }
}
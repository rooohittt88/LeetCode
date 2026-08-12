class Solution {
    public int pivotIndex(int[] nums) {
        int left=0;
        int sum=0;
        int prefix=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix+=nums[i];
        }
            sum=prefix;
        for(int i=0;i<nums.length;i++){
            int ans=sum-left-nums[i];
            if(ans==left) return i;
            else left+=nums[i];
        }
        return -1;
    }
}
class Solution {
    public int minimizeArrayValue(int[] nums) {
        int n=nums.length;
        long ans=nums[0];
        long total=nums[0];
        for(int i=1;i<n;i++){
            total+=nums[i];
            ans=Math.max(ans,(total+i)/(i+1));
        }
        return (int)ans;
    }
}
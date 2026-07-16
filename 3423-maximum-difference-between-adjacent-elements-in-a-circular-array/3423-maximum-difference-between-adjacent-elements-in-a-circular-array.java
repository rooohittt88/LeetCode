class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int len=nums.length;
        int dif=Math.abs(nums[len-1]-nums[0]);
        for(int i=1;i<len;i++){
            int min1=nums[i]-nums[i-1];
            min1=Math.abs(min1);
            dif=Math.max(dif,min1);
        }
        return Math.abs(dif);
    }

}
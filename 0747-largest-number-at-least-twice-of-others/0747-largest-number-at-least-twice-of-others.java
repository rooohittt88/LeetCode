class Solution {
    public int dominantIndex(int[] nums) {
        int max=nums[0];
        int n=nums.length;
        int index=0;
        for(int i=1;i<n;i++){
            if(nums[i]>max){ 
            max=nums[i];
            index=i;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=max && max<2*nums[i]) return -1;
        }
        return index;
    }
}
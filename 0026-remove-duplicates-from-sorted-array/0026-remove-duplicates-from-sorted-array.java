class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int count=1;
        int i=0;
        int j=0;
        for(j=0;j<n;j++){
            if(nums[i]==nums[j]){
                continue;
            }
            else{
                i++;
                nums[i]=nums[j];
                count++;
                }
        }
        return count;
    }
}
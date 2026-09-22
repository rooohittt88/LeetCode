class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[nums.length]; 
        int in=0; 
        for(int i=0;i<n;i++) { 
            ans[in++]=nums[i]; ans[in++]=nums[i+n]; } return ans;
    }
}
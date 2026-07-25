class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int sum=0;
        int max=0;
        while(k>0){
        max=nums[n-1];
        sum+=max;
        nums[n-1]=max+1;
        k--;}
        return sum;
    }
}
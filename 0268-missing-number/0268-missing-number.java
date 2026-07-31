class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int summ=0;
        for(int i=0;i<n+1;i++){
            summ+=i;
        }
        return summ-sum;
    }
}
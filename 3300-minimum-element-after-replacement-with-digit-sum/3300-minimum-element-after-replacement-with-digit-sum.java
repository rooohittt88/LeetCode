class Solution {
    public int sum(int n){
        int sum1=0;
        while(n>0){
            sum1=sum1+n%10;
            n/=10;
        }
        return sum1;
    }
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=sum(nums[i]);
        }

        int min1=nums[0];
        for(int i=1;i<nums.length;i++){
            // Math.min(min1,nums[i]);
            if(nums[i]<min1){
                min1=nums[i];
            }
        }
        return min1;
    }
}
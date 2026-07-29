class Solution {
    public int rev(int n){
        int temp=0;
        int sum=0;
        while(n>0){
            temp=n%10;
            sum+=temp;
            n/=10;
        }
        return sum;
    }
    public int differenceOfSum(int[] nums) {
        int esum=0;
        for(int i=0;i<nums.length;i++){
            esum+=nums[i];
        }
        int dsum=0;
        for(int i=0;i<nums.length;i++){
            dsum+=rev(nums[i]);
        }
        return Math.abs(esum-dsum);
    }
}
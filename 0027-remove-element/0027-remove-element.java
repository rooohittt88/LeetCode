class Solution {
    public int removeElement(int[] nums, int val) {
        int counter=0;
        int n=nums.length;
        int left=0;
        int right=n-1;
        while(left<right){
            if(nums[left]==val){
            int temp=nums[right];
            nums[right]=nums[left];
            nums[left]=temp;
            right--;}
            else left++;
        }
        for(int i=0;i<n;i++){
            if(nums[i]==val) counter++;
        }
        return n-counter;
    }
}
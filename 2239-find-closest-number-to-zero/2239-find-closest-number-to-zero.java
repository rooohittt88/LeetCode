class Solution { 
    public int findClosestNumber(int[] nums) { 
        int n=nums.length; 
        int i=0; 
        int max=nums[i];
        
        for(i=1;i<n;i++){ 
            if(Math.abs(nums[i])<Math.abs(max)){ 
                max=nums[i]; 
            } 
            else if(Math.abs(nums[i])==Math.abs(max)){ 
                max=Math.max(max,nums[i]); 
            } 
        } 
        return max; 
    } 
}

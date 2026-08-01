class Solution {
    public int findFinalValue(int[] nums, int o) {
        int i=0;
        while(i<nums.length){
            if(nums[i]==o) {
                o*=2;
                i=0;
                continue;
            }
            i++;
            }
        
        return o;
    }
}
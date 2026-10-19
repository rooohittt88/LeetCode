class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n=nums.length;
        List<Integer> ans=new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]==target) ans.add(i);
        }
        return ans;
    }
}
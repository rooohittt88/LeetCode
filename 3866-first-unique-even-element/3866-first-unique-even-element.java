class Solution {
    public int firstUniqueEven(int[] nums) {
        int n=nums.length;
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);
        }
        for(int i=0;i<n;i++){
            if(nums[i]%2==0 && countMap.get(nums[i]) == 1) return nums[i];
        }
        return -1;
    }
}
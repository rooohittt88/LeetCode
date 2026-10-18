class Solution {
    public int findMaxK(int[] nums) {
        int maxK=-1;
        Set<Integer> seen=new HashSet<>();
        
        for(int num:nums) {
            if (seen.contains(-num)) maxK = Math.max(maxK, Math.abs(num));
            seen.add(num);
        }
        return maxK;
    }
}

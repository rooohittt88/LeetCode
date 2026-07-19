import java.util.HashMap;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        int totalPairs = 0;
        for (int count : countMap.values()) {
            totalPairs += (count * (count - 1)) / 2;
        }
        
        return totalPairs;
    }
}

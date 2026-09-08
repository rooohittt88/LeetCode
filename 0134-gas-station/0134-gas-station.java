class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalSum = 0;
        int currentTank = 0;
        int start = 0;
        
        for (int i = 0; i < gas.length; i++) {
            int netBalance = gas[i] - cost[i];
            totalSum += netBalance;
            currentTank += netBalance;

            if (currentTank < 0) {
                start = i + 1;
                currentTank = 0;
            }
        }

        if (totalSum < 0) return -1;
        else return start;
    }
}

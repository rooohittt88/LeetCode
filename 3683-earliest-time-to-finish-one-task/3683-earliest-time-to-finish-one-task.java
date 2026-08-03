class Solution {
    public int earliestTime(int[][] tasks) {
        int sum = tasks[0][0] + tasks[0][1];
        for (int i = 0; i < tasks.length; i++) {
            int temp = tasks[i][0] + tasks[i][1];
            sum = Math.min(temp, sum);
        }
        return sum;
    }
}

class Solution {
    public int countOdds(int low, int high) {
        // int count=0;
        // for(int i=low;i<=high;low++){
        //     if(low%2!=0) count++;
        //     if(low>=high) break;
        // }
        // return count; works for 82/84 testcases but bc time limit exceeded
        return (high + 1) / 2 - low / 2;
    }
}
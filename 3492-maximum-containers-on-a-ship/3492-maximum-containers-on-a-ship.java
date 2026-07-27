class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int ans=n*n;
        int weight=ans*w;
        if(weight>maxWeight) return maxWeight/w;
        else return ans;
    }
}
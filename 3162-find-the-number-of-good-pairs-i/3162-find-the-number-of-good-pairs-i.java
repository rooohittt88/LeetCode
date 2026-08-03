class Solution {
    public int numberOfPairs(int[] n1, int[] n2, int k) {
        int n=n1.length;
        int m=n2.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((n1[i])%(n2[j]*k)==0) count++;
            }
        }
        return count;
    }
}
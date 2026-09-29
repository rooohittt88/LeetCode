class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n=spells.length;
        int m=potions.length;
        int[] ans=new int[n];

        for(int i=0;i<n;i++){
            int index=m;
            int low=0;
            int high=m-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if((long)spells[i]*potions[mid]>=success) {
                    high=mid-1;
                    index=mid;
                }
                else {
                    low=mid+1;
                }
            }
            ans[i]=m-index;
        }

        return ans;
    }
}
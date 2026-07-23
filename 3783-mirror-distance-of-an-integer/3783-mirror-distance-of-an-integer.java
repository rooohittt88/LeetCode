class Solution {
    public int mirrorDistance(int n) {
        int org=n;
        int sum=0;
        while(n>0){
            int temp=n%10;
            sum=sum*10+temp;
            n=n/10;
        }
        return Math.abs(org-sum);
    }
}
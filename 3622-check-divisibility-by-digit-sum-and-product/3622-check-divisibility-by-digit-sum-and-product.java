class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int or=n;
        while(or>0){
            int temp=or%10;
            sum=sum+temp;
            product=product*temp;
            or=or/10;
        }
        int gsum=sum+product;
        if(n%gsum==0) return true;
        return false;
        // return n%(gsum+product)==0;
    }
}
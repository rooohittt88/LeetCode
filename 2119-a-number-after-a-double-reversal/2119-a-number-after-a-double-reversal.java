class Solution {
    public int rev(int n){
        int sum=0;
        while(n>0){
            int temp=n%10;
            sum=sum*10+temp;
            n=n/10;
        }
        return sum;
    }
    public boolean isSameAfterReversals(int num) {
        int ans1=rev(num);
        int ans2=rev(ans1);
        if(ans2==num) return true;
        else {return false;}
        // return true;
    }
}
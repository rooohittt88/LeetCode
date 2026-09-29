class Solution {

    public int square(int n){
        int sum=0;
        int temp;
        while(n!=0){
            temp=n%10;
            sum=sum+temp*temp;
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int ans=0;
        while(n!=1 && n!=4) n=square(n);
        if(n==1) return true;
        else return false;
        // return true;
    }
}
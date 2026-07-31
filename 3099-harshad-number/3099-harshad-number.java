class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int o=x;
        while(o>0){
            sum=sum+o%10;
            o/=10;
        }
        if(x%sum==0) return sum;
        else return -1;
    }
}